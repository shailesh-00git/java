import java.io.*;

class ParseDemo {
  public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 0 to stop:");
    int sum = 0;
    int i = 0;
    do {
      try {
        // converting to number
        // br.readline() return string
        i = Integer.parseInt(br.readLine());

      } catch (IOException e) {
        System.out.println(e);
      }
      sum = sum + i;
      System.out.println("Sum = " + sum);
    } while (i != 0);
  }
}