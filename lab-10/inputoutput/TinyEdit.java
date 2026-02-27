import java.io.*;

class TinyEdit {
  public static void main(String[] args) {
    // create a bufferredd reader using sysytem.in
    String[] str = new String[100];
    System.out.println("Enter line of texts:");
    System.out.println("Enter stop to quit:");
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      for (int i = 0; i < str.length; i++) {
        str[i] = br.readLine();
        if (str[i].equals("stop")) {
          break;
        }
      }
    } catch (IOException e) {
      System.out.println(e);
    }

    System.out.println("\nHere is the text you entered:");
    for (int i = 0; i < str.length; i++) {
      if (str[i].equals("stop")) {
        break;
      }
      System.out.println(str[i]);
    }
  }
}