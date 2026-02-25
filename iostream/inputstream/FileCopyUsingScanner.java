
import java.io.*;
import java.util.*;

public class FileCopyUsingScanner {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter source file: ");
    String srcFile = scn.nextLine();
    System.out.println("Enter destionation file: ");
    String desFile = scn.nextLine();
    FileInputStream fis = new FileInputStream(srcFile);
    FileOutputStream fos = new FileOutputStream(desFile);
    int data;
    while ((data = fis.read()) != -1) {
      fos.write(data);
    }
    System.out.println("File copied ........");
    scn.close();
    fos.close();
    fis.close();

  }

}
