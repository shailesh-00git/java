
// Custom exception class for invalid age
class InvalidAgeException extends Exception {
  public InvalidAgeException(String message) {
    super(message);
  }
}

class Exception5 {
  public static void main(String[] args) {
    int age = 17; // Example age
    try {
      if (age < 18) {
        throw new InvalidAgeException("You must be at least 18 years old to access this content.");
      }
    } catch (InvalidAgeException e) {
      System.out.println(e);
    }
  }
}