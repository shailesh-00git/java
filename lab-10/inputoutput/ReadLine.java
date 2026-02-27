import java.io.*;

class ReadLine {
  public static void main(String[] args) {

    String str = null;
    System.out.println("Enter 'stop' to quit:");

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      do {
        System.out.println("Enter lines of text:");
        // br.readLine returns string
        str = br.readLine();
        System.out.println("You Entered: " + str);
      } while (!str.equals("stop"));
    } catch (IOException e) {
      System.out.println(e);
    }

  }
}