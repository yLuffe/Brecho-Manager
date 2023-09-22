package Controller;

import Model.Clothing;
import Model.ClothingDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControllerClothing {

    ClothingDAO database = new ClothingDAO();

    //MainScreen mainView = null
    // Empty Constructor
    public ControllerClothing() {
    }

//    public ControllerClothing(MainScreen mainScreen) {
//        this.MainScreen = mainScreen;
//        // Atualizar Tabela
//        this.MainScreen.updateTable(this.listClothes(selectedFilter));
//    }
    // Create
    public boolean createClothing(Clothing clothes) throws Exception {
        try {
            boolean isCreated = database.addClothing(clothes);

            // Atualizar Tabela
            /*
            
             */
            return isCreated;
        } catch (Exception e) {
            throw new Exception("Erro adicionar ao banco de dados", e);
        }
    }

    // Read
    String selectedFilter = " ";

    public ArrayList<Clothing> listClothes(String filter) {
        try {
            ArrayList<Clothing> clothes = database.getAllClothing();
            ArrayList<Clothing> filteredClothes = new ArrayList<>();

            switch (filter.toLowerCase().trim()) {
                /*
                
                Adicionar Filtros com Collectios
                
                 */
            }
            this.selectedFilter = filter;
            return clothes;
        } catch (Exception e) {
            //throw new Exception("Erro ao listar roupas", e);
            JOptionPane.showMessageDialog(null, e);
        }
        return listClothes("insert a filter here");
    }

    // Update
    public boolean editClothing(Clothing clothes) throws Exception {

        try {
            boolean isUpdated = database.updateClothing(clothes);

            // Atualizar Tabela
            /*
            
             */
            return isUpdated;
        } catch (Exception e) {
            throw new Exception("Erro ao Editar", e);
        }
    }

}
