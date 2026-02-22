package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ShowFile {
  public static void main(String[] args) {

    int i;
    FileInputStream fin;
    // first confirm that a file name has been specified
    if (args.length != 1) {
      System.out.println("Usage: ShowFile filename");
      return;
    }
    // attepmt to open a file
    try {
      fin = new FileInputStream(args[0]);
    } catch (FileNotFoundException e) {
      System.out.println("cannot open a file");
      return;
    }

    try {

      do {
        i = fin.read();
        if (i != -1) {
          System.out.print((char) i);
        }

      } while (i != -1);

    } catch (Exception e) {
      System.out.println("Error reading file: ");
    }

    // close the file
    try {
      fin.close();
    } catch (Exception e) {
      System.out.println("Error closing file: ");
    }
  }
}