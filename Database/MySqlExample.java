
import java.sql.*;

public class MySqlExample {
    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mariadb://localhost:3306/bca081";
        String user = "root";
        String password = "";

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create statement
            Statement stmt = conn.createStatement();

            // Execute query
            String query = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(query);

            // Process result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("ID: " + id + ", Name: " + name + " Email: " + email);
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}