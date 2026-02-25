import java.io.*;

public class ReadFileData {
  public static void main(String[] args) throws Exception {
    try (FileInputStream fis = new FileInputStream("abc.txt")) {

      int data;

      // dy default read single byte of data in a single call
      while ((data = fis.read()) != -1) {
        System.out.print((char) data);
      }
    }
  }

}
