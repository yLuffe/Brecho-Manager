package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class ConnectionSQLite {

    private Connection conn;

    public Connection getConnection() {
        return this.conn;
    }

    //Método para realizar a conexão com o banco de dados
    public boolean connect() {
        try {
            String url = "jdbc:sqlite:database/clothes_db.db";

            this.conn = DriverManager.getConnection(url);

            // Cria a tabela se não existir
            String createTableSQL = "CREATE TABLE IF NOT EXISTS nome_da_tabela ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,"
                    + "name TEXT (48) NOT NULL,"
                    + "description TEXT (256),"
                    + "category TEXT (48) NOT NULL,"
                    + "size TEXT (4) NOT NULL,"
                    + "color TEXT (48) NOT NULL,"
                    + "price REAL (6, 2) NOT NULL,"
                    + "consigned INTEGER (1) NOT NULL,"
                    + "newClothes INTEGER (1) NOT NULL,"
                    + "customerName TEXT (48));";

            try (Statement statement = conn.createStatement()) {
                statement.execute(createTableSQL);
                System.out.println("Tabela criada ou verificada com sucesso!");
            }

            System.out.println("Conexão estabelecida com sucesso!");
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao estabelecer a conexão: " + e.getMessage());
            e.printStackTrace();

            return false;
        }
    }

    //Método para realiar a conexão com o banco de dados
    public boolean desconectar() {
        try {
            if (this.conn != null && !this.conn.isClosed()) {
                this.conn.close();
                System.out.println("Conexão finalizada com sucesso!");
                return true;
            } else {
                System.out.println("Nenhuma conexão para fechar.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Cria um PreparedStatement com a consulta SQL dada
    public PreparedStatement createPreparedStatement(String sql) {
        try {
            return this.conn.prepareStatement(sql);
        } catch (SQLException e) {
            System.err.println("Erro ao criar PreparedSTMT");
            e.printStackTrace();
            return null;
        }
    }
}
