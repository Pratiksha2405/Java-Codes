//Write a Java function that takes a string and returns a new string with all duplicate characters removed, keeping only the first occurrence of each character. The result should preserve the original order of characters.
import java.util.HashSet;

 class RemoveDuplicates {

     static String removeDuplicates(String input) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "programming";
        String input2 = "aabbcc";

        System.out.println("Input: " + input1 + " -> Output: " + removeDuplicates(input1));
        System.out.println("Input: " + input2 + " -> Output: " + removeDuplicates(input2));
    }
}

