import java.util.Scanner;
import java.io.*;

public class TakeInput {
  public static void main(String[] args) throws Exception {

    FileOutputStream fin = new FileOutputStream("hello.txt");
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter stop to stop: ");
    String str = null;
    byte[] arr;

    do {
      str = scn.next();
      if (!str.equals("stop")) {
        arr = str.getBytes();
        fin.write(arr);
        System.out.println("You entered: " + str + " " + " saved in file");
      }

    } while (!str.equals("stop"));
    fin.close();
    scn.close();
  }
}
