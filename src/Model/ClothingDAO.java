package Model;

import java.sql.*;
import Database.ConnectionSQLite;
import java.util.ArrayList;

public class ClothingDAO {

    private final ConnectionSQLite conn;

    public ClothingDAO() {
        conn = new ConnectionSQLite();
        conn.connect();
    }

    // Create
    public boolean addClothing(Clothing clothing) {
        String sql = "INSERT INTO clothes_tb (name, description, category, size, color, price, consigned, newClothes, customerName) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.createPreparedStatement(sql)) {
            stmt.setString(1, clothing.getName());
            stmt.setString(2, clothing.getDescription());
            stmt.setString(3, clothing.getCategory());
            stmt.setString(4, clothing.getSize());
            stmt.setString(5, clothing.getColor());
            stmt.setDouble(6, clothing.getPrice());
            stmt.setInt(7, clothing.isConsigned() ? 1 : 0);
            stmt.setInt(8, clothing.isNewClothes() ? 1 : 0);
            stmt.setString(9, clothing.getCustomerName());
            stmt.executeUpdate();
            return true; // Inserido com Sucesso
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Falha ao Inserir
        }
    }

    // Read
    public Clothing getClothingById(int id) {
        String sql = "SELECT * FROM clothes_tb WHERE id = ?";
        try (PreparedStatement stmt = conn.createPreparedStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    String name = resultSet.getString("name");
                    String description = resultSet.getString("description");
                    String category = resultSet.getString("category");
                    String size = resultSet.getString("size");
                    String color = resultSet.getString("color");
                    double price = resultSet.getDouble("price");
                    boolean consigned = resultSet.getInt("consigned") == 1;
                    boolean newClothes = resultSet.getInt("newClothes") == 1;
                    String customerName = resultSet.getString("customerName");
                    return new Clothing(id, name, description, category, size, color, price, consigned, newClothes, customerName);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Update
    public boolean updateClothing(Clothing clothing) {
        String sql = "UPDATE clothes_tb SET name = ?, description = ?, category = ?, size = ?, color = ?, price = ?, consigned = ?, newClothes = ?, customerName = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.createPreparedStatement(sql)) {
            stmt.setString(1, clothing.getName());
            stmt.setString(2, clothing.getDescription());
            stmt.setString(3, clothing.getCategory());
            stmt.setString(4, clothing.getSize());
            stmt.setString(5, clothing.getColor());
            stmt.setDouble(6, clothing.getPrice());
            stmt.setInt(7, clothing.isConsigned() ? 1 : 0);
            stmt.setInt(8, clothing.isNewClothes() ? 1 : 0);
            stmt.setString(9, clothing.getCustomerName());
            stmt.setInt(10, clothing.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Delete
    public boolean deleteClothing(int id) {
        String sql = "DELETE FROM clothes_tb WHERE id = ?";
        try (PreparedStatement stmt = conn.createPreparedStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Read All
    public ArrayList<Clothing> getAllClothing() {
        ArrayList<Clothing> clothingList = new ArrayList<>();
        String sql = "SELECT * FROM clothes_tb";
        try (PreparedStatement stmt = conn.createPreparedStatement(sql); ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                String category = resultSet.getString("category");
                String size = resultSet.getString("size");
                String color = resultSet.getString("color");
                double price = resultSet.getDouble("price");
                boolean consigned = resultSet.getInt("consigned") == 1;
                boolean newClothes = resultSet.getInt("newClothes") == 1;
                String customerName = resultSet.getString("customerName");
                Clothing clothing = new Clothing(id, name, description, category, size, color, price, consigned, newClothes, customerName);
                clothingList.add(clothing);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clothingList;
    }
}
