import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) {

    if (args.length != 2) {
      System.out.println("Please enter src and des file");
      return;
    }
    int i;

    try (FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1])) {
      do {
        i = fis.read();
        if (i != -1) {
          fos.write(i);
        }
      } while (i != -1);
      System.out.println("File copied successfully");
    } catch (IOException e) {
      System.out.println(e);
    }

  }
}
