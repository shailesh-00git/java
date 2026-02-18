class Initials {
  public static void main(String[] args) {
    String name = "Shailesh yadav";
    System.out.println(name);
    System.out.print(Character.toUpperCase(name.charAt(0)));

    for (int i = 0; i < name.length() - 1; i++) {
      if (name.charAt(i) == ' ') {
        // 3. Print the character immediately after the space
        char ch = name.charAt(i + 1);
        System.out.print("." + Character.toUpperCase(ch));
      }
    }
    System.out.println();
  }
}
