import java.sql.*;

public class CreateMyMartDatabase {
    public static void main(String[] args) {
        try (
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mymart", "your_username", "your_password");
            Statement statement = connection.createStatement()
        ) {
            // Create the database if it doesn't exist
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS mymart";
            statement.execute(createDatabaseSQL);

            // Use the newly created database
            connection.setCatalog("mymart");

            // Create the "products" table
            String createProductsTableSQL = "CREATE TABLE products (" +
                    "product_id INT PRIMARY KEY AUTO_INCREMENT," +
                    "product_name VARCHAR(100) NOT NULL," +
                    "product_price DECIMAL(10, 2) NOT NULL," +
                    "product_quantity INT NOT NULL" +
                    ")";
            statement.executeUpdate(createProductsTableSQL);

            // ... (rest of the table creation code)

            System.out.println("Database and tables created successfully.");
        } catch (SQLException e) {
            // e.printStackTrace(); // Prints the stack trace
        }
    }
}