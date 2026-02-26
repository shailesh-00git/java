import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UsingBufferedReader {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your message");
    // br.readLine() --> reades a single character and return int value(ASCII)
    // br.readLine() --> read whoe line as string
    String str = null;

    do {
      str = br.readLine();
      if (!str.equals("exit")) {
        System.out.println("You entered: " + str);

      }
    } while (!str.equals("exit"));

    br.close();

  }
}
