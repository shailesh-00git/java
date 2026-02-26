import java.util.Scanner;

public class UnsingScanner {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = null;
    System.out.println("Enter your mesage: ");
    do {
      System.out.println("Enter 'stop1 to exit");
      str = scn.nextLine();
      if (!str.equals("stop")) {
        System.out.println("Your message is: " + str);
      }

    } while (!str.equals("stop"));
    scn.close();

  }
}
