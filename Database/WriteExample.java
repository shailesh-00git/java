import java.io.*;
import java.sql.*;

class WriteExample {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter name: ");
            String nameInput = br.readLine();

            String url = "jdbc:mariadb://localhost:3306/bca081";
            String user = "root";
            String password = "";

            // Step 1: Connect
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 2: Insert data (BEST: PreparedStatement)
            String insertQuery = "INSERT INTO students(name) VALUES (?)";
            PreparedStatement pst = con.prepareStatement(insertQuery);
            pst.setString(1, nameInput);

            int res = pst.executeUpdate();
            if (res == 1) {
                System.out.println(nameInput + " inserted");
            }

            // Step 4: Close

            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}