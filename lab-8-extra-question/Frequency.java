// a program to count the highest frequency of a character i  a string
class Frequency {
  public static void main(String[] args) {
    String str = "Ee";
    int[] freq = new int[str.length()];

    // counting the frquency
    for (int i = 0; i < str.length(); i++) {
      char ch0 = str.charAt(i);
      char ch = Character.toLowerCase(ch0);
      if (ch == ' ') {
        continue;
      }
      int index = i;
      for (int j = 0; j < str.length(); j++) {
        if (ch == str.charAt(j)) {
          freq[index]++;
        }
      }
      index++;
      System.out.println("character: " + ch + " frequency: " + freq[index - 1]);
    }

  }

}
