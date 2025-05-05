//Write a Java function that takes a sentence as input and returns a new sentence where each word is reversed, but the order of the words remains the same.
 class ReverseEachWord {

     static String reverseEachWord(String sentence) {
        // Trim and split the sentence into words using one or more spaces
        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = "";

            // Reverse the characters of each word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }

            // Append the reversed word and a space
            result.append(reversed).append(" ");
        }

        // Convert to string and trim the final space
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input1 = "Java is fun";
        String input2 = "hello   world";

        System.out.println(reverseEachWord(input1)); // Output: avaJ si nuf
        System.out.println(reverseEachWord(input2)); // Output: olleh dlrow
    }
}

