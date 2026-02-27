
import java.io.*;

class ShowFile {
  public static void main(String[] args) {
    int i;

    // first confirm that a file name has been specified
    if (args.length != 1) {
      System.out.println("Usage: Pleasse enter filename");
      return;
    }
    // attepmt to open a file
    try (FileInputStream fin = new FileInputStream(args[0])) {
      do {
        i = fin.read();
        if (i != -1) {
          System.out.print((char) i);
        }
      } while (i != -1);
    } catch (FileNotFoundException e) {
      System.out.println("cannot open a file");

    } catch (IOException e) {
      System.out.println(e);
    }
    System.out.println("\n!!! File closed !!!");
  }
}