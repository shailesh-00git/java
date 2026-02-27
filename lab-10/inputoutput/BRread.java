import java.io.*;

class BRread {
  public static void main(String[] args) throws IOException {
    char c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a character ,'q' to quit.");
    // read all characters
    do {
      c = (char) br.read();
      if (c != '\n' && c != '\r' && c != 'q') // ignore newline characters
        System.out.println("Entered character: " + c);
    } while (c != 'q');
  }
}