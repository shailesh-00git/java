import java.io.*;

public class WriteFileData {
  public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("xyz.txt");
    fos.write(3);
    fos.close();
    System.err.println("Data save sin file...");
  }
}
