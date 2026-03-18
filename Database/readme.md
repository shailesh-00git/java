# Steps: to run the database program in java

1.  import package:
    i.e import java.sql.\*;

2.  Establish the connection:
    // Database credentials
    String url = "jdbc:mariadb://localhost:3306/bca081";
    String user = "root";
    String password = "";

    mariadb -> driver_name
    bca081 -> database_name

3.  Actual Connection and Query:

    Connection conn = DriverManager.getConnection(url, user, password);
    // Create statement
    Statement stmt = conn.createStatement();
    // Execute quer String query = "SELECT \* FROM users";
    ResultSet rs = stmt.executeQuery(query);


4. close the connections:
   conn.close();
   rs.close();
   stmt.close();


# steps to run the program
1. compile : javac FILE_NAME.java
2. run: java -cp ".;DRIVE_FILE_NAME.jar" FILE_NAME