package Controller;

import Model.Clothing;
import Model.ClothingDAO;
import Model.Filter.CategoryFilter;
import Model.Filter.ColorFilter;
import View.MainScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ControllerClothing {

    ClothingDAO database = new ClothingDAO();
    MainScreen mainView = null;
    String selectedFilter = "Todas,Todas,Todos,Padrão";
    ColorFilter colorFilter = new ColorFilter();
    CategoryFilter categoryFilter = new CategoryFilter();

    // Empty Constructor
    public ControllerClothing() {
    }

    public ControllerClothing(MainScreen mainScreen) {
        this.mainView = mainScreen;
        // Atualizar Tabela
        this.mainView.updateTable(this.listClothes(selectedFilter));
    }

    // Create
    public boolean createClothing(Clothing clothes) throws Exception {
        try {
            boolean isCreated = database.addClothing(clothes);
            // Atualizar Tabela
            this.mainView.updateTable(this.listClothes(selectedFilter));
            return isCreated;
        } catch (Exception e) {
            throw new Exception("Erro adicionar ao banco de dados", e);
        }
    }

    // Read
    public ArrayList<Clothing> listClothes(String filter) {
        try {
        ArrayList<Clothing> clothes = database.getAllClothing();
        ArrayList<Clothing> filteredClothes = new ArrayList<>();

        String[] filters = filter.split(",");

        // Crie um filtro condicional para cada critério de filtro
        Predicate<Clothing> categoryFilter = clothing ->
            filters[0].equals("Todas") || clothing.getCategory().contains(filters[0]);

        Predicate<Clothing> colorFilter = clothing ->
            filters[1].equals("Todas") || clothing.getColor().contains(filters[1]);

        Predicate<Clothing> sizeFilter = clothing ->
            filters[2].equals("Todos") || clothing.getSize().contains(filters[2]);

        //Predicate<Clothing> multiFilter = clothing ->
           // filters[3].equals("Padrão") || clothing.getSize().contains(filters[2]);

        // Aplique os filtros condicionais encadeados
        filteredClothes = clothes.stream()
            .filter(categoryFilter)
            .filter(colorFilter)
            .filter(sizeFilter)
            //.filter(multiFilter)
            .collect(Collectors.toCollection(ArrayList::new));

        return filteredClothes;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return listClothes(null);
    }

    // Update
    public boolean editClothing(Clothing clothes) throws Exception {
        try {
            boolean isUpdated = database.updateClothing(clothes);
            // Atualizar Tabela
            this.mainView.updateTable(this.listClothes(selectedFilter));
            return isUpdated;
        } catch (Exception e) {
            throw new Exception("Erro ao Editar", e);
        }
    }

    // Delete
    public boolean deleteClothing(int id) throws Exception {
        try {
            boolean isDeleted = database.deleteClothing(id);
            this.mainView.updateTable(this.listClothes(selectedFilter));
            return isDeleted;
        } catch (Exception e) {
            throw new Exception("Erro ao deletar", e);
        }
    }

    // Procurar por ID
    public Clothing findClothingById(int id) throws Exception {
        try {
            return database.getClothingById(id);
        } catch (Exception e) {
            throw new Exception("Erro ao procurar por ID", e);
        }
    }

    // Comandos adicionar itens nas ComboBox
    public void loadComboColors(JComboBox<String>... comboBoxes) {
        for (JComboBox<String> comboBox : comboBoxes) {
            comboBox.removeAllItems();
            for (String color : colorFilter.getAvailableColors()) {
                comboBox.addItem(color);
            }
            comboBox.revalidate();
            comboBox.repaint();
        }
    }

    public void loadComboCategories(JComboBox<String>... comboBoxes) {
        for (JComboBox<String> comboBox : comboBoxes) {
            comboBox.removeAllItems();
            for (String category : categoryFilter.getAvailableCategories()) {
                comboBox.addItem(category);
            }
            comboBox.revalidate();
            comboBox.repaint();
        }
    }
}
