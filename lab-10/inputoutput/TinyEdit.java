import java.io.*;

class TinyEdit {
  public static void main(String[] args) throws IOException {
    // create a bufferredd reader using sysytem.in
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
    String[] str = new String[100];
    System.out.println("Enter line of texts:");
    System.out.println("Enter stop to quit:");
    for (int i = 0; i < str.length; i++) {
      str[i] = br.readLine();
      if (str[i].equals("stop")) {
        break;
      }
    }
    System.out.println("\nHere is th etext you entered:");
    for (int i = 0; i < str.length; i++) {
      if (str[i].equals("stop")) {
        break;
      }
      System.out.println(str[i]);
    }
  }
}