public class hashCode {
  public static void main(String[] args) {
    String password = "mySecretPassword123";

    // Generate the hash code (no salt)
    int hash = password.hashCode();

    System.out.println("Password: " + password);
    System.out.println("Generated HashCode: " + hash);

    // Simple Verification
    String input = "mySecretPassword123";
    if (input.hashCode() == hash) {
      System.out.println("Access Granted!");
    } else {
      System.out.println("Access Denied!");
    }
  }
}
