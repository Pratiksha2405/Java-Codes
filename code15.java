//Write a Java function that takes a string containing multiple words and reverses the order of the words, but keeps the individual words in their original order. The string may contain extra spaces between words, which should be removed in the final result.
 class ReverseWords {

    static String reverseWords(String input) {
        // Trim leading and trailing spaces
        input = input.trim();

        // Split the string into words based on spaces
        String[] words = input.split("\\s+");

        // Build the reversed sentence
        StringBuilder result = new StringBuilder();

        // Loop through the words in reverse order and add them to the result
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");  // Add a space between words
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "  Hello   World  ";
        String input2 = "  Java is fun ";

        System.out.println("Reversed words in '" + input1 + "' : " + reverseWords(input1));
        System.out.println("Reversed words in '" + input2 + "' : " + reverseWords(input2));
    }
}

