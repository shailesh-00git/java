
import java.io.*;
import java.util.Scanner;

class ReadingFile {
  public static void main(String[] args) {
    FileInputStream fis = null;
    int i;
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter file to read: ");
    String src = scn.nextLine();
    if (args.length != 1) {
      System.out.println("Please enter file name");
    }
    try {
      fis = new FileInputStream(src);
      do {
        i = fis.read();
        if (i != -1) {
          System.out.print((char) i);
        }

      } while (i != -1);

    } catch (IOException e) {
      System.out.println(e);
    }

  }
}
