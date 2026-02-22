package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRread {
  public static void main(String[] args) throws IOException {
    char c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a character ,'q' to quit.");
    // read all characters
    do {
      c = (char) br.read();
      System.out.println(c);

    } while (c != 'q');
  }
}