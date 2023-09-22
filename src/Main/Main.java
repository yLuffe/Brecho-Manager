package Main;

import Database.ConnectionSQLite;
import Model.Clothing;
import Model.ClothingDAO;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        // Altera o nome dos botões de YES e NO do JOP para SIM e NÃO
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        // Chamando banco de dados e conectando
        ConnectionSQLite connect = new ConnectionSQLite();
        connect.connect();

        
        Clothing clothes = new Clothing(1, "Casaco de Veludo", "Manga curta", "Inverno", "G", "Preto", 89.9, false, true, "Renner");
        
        new ClothingDAO().addClothing(clothes);
        
        
        
        // Registrar o shutdown hook para desconectar a conexão
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            connect.disconnect();
        }));
    }
    
}
