import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {

        String str = "I Love Nepal";
        str = str.toLowerCase(); // optional, to ignore case

        // Create a HashMap to store character counts
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }

            // Update frequency
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        // Display frequency
        System.out.println("Character Frequency:");
        for (Character ch : freqMap.keySet()) {
            System.out.println(ch + " : " + freqMap.get(ch));
        }
    }
}