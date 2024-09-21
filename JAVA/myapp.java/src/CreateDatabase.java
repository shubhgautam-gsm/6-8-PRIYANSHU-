import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306";
        String username = "root"; // Change to your MySQL username
        String password = "password"; // Change to your MySQL password

        try {
            // Establish the connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Create a statement object to execute SQL queries
            Statement statement = connection.createStatement();

            // Create a new database
            String createDatabaseSQL = "CREATE DATABASE mybookstore";
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database 'mybookstore' created successfully.");

            // Select the database to use
            statement.executeUpdate("USE mybookstore");

            // Create a new table
            String createTableSQL = "CREATE TABLE books ("
                    + "id INT NOT NULL AUTO_INCREMENT, "
                    + "title VARCHAR(100) NOT NULL, "
                    + "author VARCHAR(100) NOT NULL, "
                    + "price DECIMAL(10, 2) NOT NULL, "
                    + "PRIMARY KEY (id))";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'books' created successfully.");

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
