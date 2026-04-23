import java.sql.*;
import java.io.*;

class Test {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // db connectionClosed(String, String, Object)
        try {
            Connection con = DriverManager.getConnection("jdbc:mysqli:mariadb://localhost/3306/bca081");
            String query = "INSERT INTO users(id,name,email) VALUE(?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            // for 3 storesUpperCaseIdentifiers
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter detail for student :" + i);
                System.out.println("Id: ");
                int id = Integer.parseInt(br.readLine());
                System.out.println("Name: ");
                String name = br.readLine();
                System.out.println("Email: ");
                String email = br.readLine();
                // set()
                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setString(3, email);

                int result = pst.executeUpdate();
                if (result == 1) {
                    System.out.println("added sucessfully");
                }
            }
            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}