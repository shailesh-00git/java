import java.io.*;

class ReadLine {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = null;
    System.out.println("Enter 'stop' to quit:");
    do {
      System.out.println("Enter lines of text:");
      try {
        str = br.readLine();
        System.out.println("You Entered: " + str);
      } catch (IOException e) {
        System.out.println(e);
      }

    } while (!str.equals("stop"));

  }
}