import java.util.Random;

public class Exception3 {
  public static void main(String[] args) {
    int[] UserBalance = { 500, 1000, 1500 };
    boolean isConnected = false;
    Random rand = new Random();

    try {
      // Step 1: Connect to the 'Database'
      System.out.println("Connecting to user database...");
      isConnected = true;
      System.out.println("Connection Status: " + isConnected);

      // Step 2: Attempt to update an out-of-bounds user
      int userIndex = rand.nextInt(5); // This will generate an index from 0 to 4
      System.out.println("Updating balance for User : " + userIndex);
      int bonus = UserBalance[userIndex] + 100; // This will trigger an error

      System.out.println("Update successful! New balance: " + bonus);

    } catch (ArrayIndexOutOfBoundsException e) {
      // Step 3: Handle the specific array error
      System.out.println("User index not found. Update failed.");

    } finally {
      // Step 4: THE CLEANUP (Always runs)
      if (isConnected) {
        System.out.println("Disconnecting from the database...");
        isConnected = false;
      }
      System.out.println("Connection Status: " + isConnected);
    }

  }
}