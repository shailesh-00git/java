import java.sql.*;

class ReadExample {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mariadb://localhost:3306/bca081";
            String user = "root";
            String password = "";

            // Step 1: Connect
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 2: Insert data (BEST: PreparedStatement)
            String query = "SELECT * FROM students";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
            }
            rs.close();
            stm.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
