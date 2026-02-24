
import java.io.*;

class ParseDemo {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
    String str;
    int i;
    int sum = 0;
    System.out.println("Enter no 0 to quit:");
    do {

      try {
        str = br.readLine();
        i = Integer.parseInt(str);
      } catch (NumberFormatException e) {
        System.out.println(" invalid format");
        i = 0;
      }
      sum = sum + i;
      System.out.println("Couurennt sun is: " + sum);
    } while (i != 0);
  }
}