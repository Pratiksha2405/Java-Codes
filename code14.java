//Write a Java function that takes a string as input and returns the character that appears the most frequently. If there are multiple characters with the same maximum frequency, return any one of them
import java.util.HashMap;

 class MostFrequentCharacter {

     static char mostFrequentChar(String input) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        input = input.toLowerCase();

        // Count character frequencies
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Find character with the highest frequency
        char mostFrequent = '_';
        int maxFreq = 0;

        for (char ch : freqMap.keySet()) {
            int freq = freqMap.get(ch);
            if (freq > maxFreq) {
                maxFreq = freq;
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        String input1 = "mississippi";
        String input2 = "aabbbcccc";

        System.out.println("Most frequent character in '" + input1 + "' is: " + mostFrequentChar(input1));
        System.out.println("Most frequent character in '" + input2 + "' is: " + mostFrequentChar(input2));
    }
}

