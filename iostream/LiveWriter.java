import java.io.*;

public class LiveWriter {
    public static void main(String[] args) throws IOException {
        // 'true' in FileOutputStream = Append mode
        // 'true' in PrintWriter = Auto-flush mode (flushes on every println)
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("test.txt", true), true);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            
            System.out.println("Type something (or 'exit'):");
            String line;
            
            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) break;
                
                pw.println(line); // This writes AND flushes immediately
                System.out.println("Sent to disk!");
            }
        }
    }
}