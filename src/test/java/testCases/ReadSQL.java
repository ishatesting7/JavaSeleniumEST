package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadSQL {
    public static void main(String[] args) {
        // 1. Setup WebDriver (e.g., ChromeDriver)
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com"); // Just an example Selenium action
        System.out.println("Page Title: " + driver.getTitle());

        // 2. Setup JDBC connection
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the JDBC driver (MySQL in this case)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the database
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/yourDatabase", "username", "password");

            // Create a statement object to run SQL queries
            statement = connection.createStatement();

            // Example SQL Query
            String sql = "SELECT * FROM your_table LIMIT 5";  // Modify your query as needed
            resultSet = statement.executeQuery(sql);

            // Process the results
            while (resultSet.next()) {
                String columnData = resultSet.getString("your_column");
                System.out.println("Column Data: " + columnData);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close the JDBC objects to avoid memory leaks
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Close the WebDriver
        driver.quit();
    }
}

