package Main;

import Database.ConnectionSQLite;
import View.MainScreen;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        // Altera o nome dos botões de YES e NO do JOP para SIM e NÃO
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        // Ativa o tema Dracula
        FlatDarkPurpleIJTheme.setup();

        // Mostra a tela inicial
        new MainScreen().setVisible(true);

        // Chamando banco de dados e conectando
        ConnectionSQLite connect = new ConnectionSQLite();
        connect.connect();

        // Registrar o shutdown hook para desconectar a conexão
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            connect.disconnect();
        }));
    }
}
