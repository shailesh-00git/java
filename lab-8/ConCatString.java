class ConCatString {
  public static void main(String[] args) {
    String longStr = "This could have been" + " a very long line  that would have been" + "wrapped around"
        + "But the string concatination prevents this";
    System.out.println(longStr);
  }
}