//Write a Java function that takes a sentence as input and returns the sentence with the first letter of each word capitalized. All other letters in each word should be in lowercase.
 class CapitalizeWords {

     static String capitalizeWords(String sentence) {
        // Trim extra spaces and split by one or more spaces
        String[] words = sentence.trim().toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                // Capitalize first letter and append rest
                String capitalized = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                result.append(capitalized).append(" ");
            }
        }

        return result.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        String input1 = "java is FUN";
        String input2 = "  hEllo   worLD  ";
        
        System.out.println(capitalizeWords(input1)); // Output: Java Is Fun
        System.out.println(capitalizeWords(input2)); // Output: Hello World
    }
}

