import java.io.*;
import java.sql.*;

class WriteExample {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter name: ");
            String nameInput = br.readLine();
            System.out.print("Enter email: ");
            String emailInput = br.readLine();

            String url = "jdbc:mariadb://localhost:3306/bca081";
            String user = "root";
            String password = "";

            // Step 1: Connect
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 2: Insert data (BEST: PreparedStatement)
            String insertQuery = "INSERT INTO users(name,email) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(insertQuery);
            pst.setString(1, nameInput);
            pst.setString(2, emailInput); // Assuming you have an email input

            int res = pst.executeUpdate();
            if (res == 1) {
                System.out.println("Name:" + nameInput + "Email: " + emailInput + " inserted");
            }

            // Step 4: Close

            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}