import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class BRreadLines {
  public static void main(String[] args) throws IOException {
    // create a BufferReader using system.in
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = new String[100];
    System.out.println("Enter lines of text.");
    System.out.println("Enter 'stop' to quit.");
    for (int i = 0; i < 100; i++) {
      str[i] = br.readLine();
      if (str[i].equals("stop")) {
        break;
      }
    }
    System.out.println("\n Here is your input:");
    // display the input
    for (int i = 0; i < 100; i++) {
      if (str[i].equals("stop")) {
        break;
      }
      System.out.println(str[i]);
    }

  }
}