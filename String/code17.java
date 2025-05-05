//Write a Java function that generates all possible permutations of a given string. The function should return the permutations as a list of strings.
import java.util.*;

 class StringPermutations {

     static List<String> getPermutations(String input) {
        List<String> result = new ArrayList<>();
        // Convert the string into a character array for easy manipulation
        char[] chars = input.toCharArray();
        // Call the helper method to generate permutations
        generatePermutations(chars, 0, result);
        return result;
    }

    private static void generatePermutations(char[] chars, int index, List<String> result) {
        // If we've reached the end of the string, add the permutation to the result list
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        // Swap each character to create a new permutation
        for (int i = index; i < chars.length; i++) {
            // Swap characters at index and i
            swap(chars, index, i);
            // Recursively generate permutations for the rest of the string
            generatePermutations(chars, index + 1, result);
            // Backtrack by swapping the characters back
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = getPermutations(input);
        System.out.println("Permutations of '" + input + "': " + permutations);
    }
}

