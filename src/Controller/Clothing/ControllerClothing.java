package Controller.Clothing;

import Model.Clothing;
import Model.ClothingDAO;
import Model.Filter.CategoryFilter;
import Model.Filter.ColorFilter;
import View.MainScreen;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ControllerClothing {

    MainScreen mainView = null;
    ClothingDAO database = new ClothingDAO();
    ColorFilter colorFilter = new ColorFilter();
    CategoryFilter categoryFilter = new CategoryFilter();

    // Empty Constructor
    public ControllerClothing() {
    }

    public ControllerClothing(MainScreen mainScreen) throws Exception {
        this.mainView = mainScreen;
        // Atualizar Tabela
        this.mainView.updateTable(this.listClothes());
    }

    // Read + Filters
    public ArrayList<Clothing> listClothes(String fName, String fCategory, String fColor, String fSize) throws Exception {
        try {
            ArrayList<Clothing> allClothes = database.getAllClothing();
            ArrayList<Clothing> filteredClothes = new ArrayList<>();

            // Crie um filtro condicional para cada critério de filtro
            Predicate<Clothing> categoryFilter = clothing
                    -> fCategory.equals("Todas") || clothing.getCategory().contains(fCategory);

            Predicate<Clothing> colorFilter = clothing
                    -> fColor.equals("Todas") || clothing.getColor().contains(fColor);

            Predicate<Clothing> sizeFilter = clothing
                    -> fSize.equals("Todos") || clothing.getSize().contains(fSize);

            Predicate<Clothing> nameFilter = clothing
                    -> fName.equalsIgnoreCase("empty") || clothing.getName().toLowerCase().contains(fName.toLowerCase());

            // Aplica os filtros condicionais encadeados
            filteredClothes = allClothes.stream()
                    .filter(categoryFilter)
                    .filter(colorFilter)
                    .filter(sizeFilter)
                    .filter(nameFilter)
                    .collect(Collectors.toCollection(ArrayList::new));

            return filteredClothes;
        } catch (Exception e) {
            throw new Exception("Erro ao carregar dados");
        }
    }

    // Overload de listClothes
    public ArrayList<Clothing> listClothes() throws Exception {
        try {
            ArrayList<Clothing> allClothes = database.getAllClothing();
            return allClothes;
        } catch (Exception e) {
            throw new Exception("Erro ao carregar dados!");
        }
    }

    // Create
    public boolean createClothing(Clothing clothes) throws Exception {
        try {
            boolean isCreated = database.addClothing(clothes);
            // Atualizar Tabela
            this.mainView.updateTable(this.listClothes());
            return isCreated;
        } catch (Exception e) {
            throw new Exception("Erro adicionar ao banco de dados", e);
        }
    }

    // Update
    public boolean editClothing(Clothing clothes) throws Exception {
        try {
            boolean isUpdated = database.updateClothing(clothes);
            // Atualizar Tabela
            this.mainView.updateTable(this.listClothes());
            return isUpdated;
        } catch (Exception e) {
            throw new Exception("Erro ao Editar", e);
        }
    }

    // Delete
    public boolean deleteClothing(int id) throws Exception {
        try {
            boolean isDeleted = database.deleteClothing(id);
            this.mainView.updateTable(this.listClothes());
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
