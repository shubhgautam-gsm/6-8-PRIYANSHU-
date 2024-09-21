import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InsertMultipleData {
    public static void main(String[] args) {
        try (
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mymart", "your_username", "your_password");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO products (product_name, product_price, product_quantity) VALUES (?, ?, ?)")
        ) {
            // Create a list of products to insert
            List<Product> products = new ArrayList<>();
            products.add(new Product("Laptop", 999.99, 10));
            products.add(new Product("Smartphone", 599.99, 20));
            products.add(new Product("Tablet", 399.99, 15));

            // Iterate over the products and insert them into the database
            for (Product product : products) {
                statement.setString(1, product.getName());
                statement.setDouble(2, product.getPrice());
                statement.setInt(3, product.getQuantity());
                statement.executeUpdate();
            }

            System.out.println("Products inserted successfully.");
        } catch (SQLException e) {
            // e.printStackTrace();
        }
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters for the product properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}