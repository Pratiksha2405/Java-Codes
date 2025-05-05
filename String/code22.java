import java.util.HashMap;
import java.util.Map;

 class FirstNonRepeatingCharacter {

     static char firstNonRepeatingCharacter(String input) {
        // Create a map to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Traverse through the string and count the frequency of each character
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Traverse through the string again and find the first non-repeating character
        for (char ch : input.toCharArray()) {
            if (frequencyMap.get(ch) == 1) {
                return ch; // Return the first non-repeating character
            }
        }

        // If no non-repeating character exists, return a space
        return ' ';
    }

    public static void main(String[] args) {
        String input1 = "swiss";
        String input2 = "aabbcc";
        String input3 = "abcde";

        System.out.println(firstNonRepeatingCharacter(input1)); // Output: w
        System.out.println(firstNonRepeatingCharacter(input2)); // Output: ' ' (space)
        System.out.println(firstNonRepeatingCharacter(input3)); // Output: a
    }
}

