 class RemoveVowels {

    static String removeVowels(String input) {
        // Convert the string to a character array
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is not a vowel (case-insensitive)
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // make lowercase for uniform comparison
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String input1 = "Beautiful Day";
        String input2 = "Programming is fun";

        System.out.println(removeVowels(input1)); // Output: Btfl Dy
        System.out.println(removeVowels(input2)); // Output: Prgrmmng s fn
    }
}

