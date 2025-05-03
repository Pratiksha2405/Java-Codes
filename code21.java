 class PalindromeChecker {

    static boolean isPalindrome(String input) {
        // Convert to lowercase and remove non-alphabetic characters
        String cleaned = input.toLowerCase().replaceAll("[^a-z]", "");

        int left = 0;
        int right = cleaned.length() - 1;

        // Check characters from both ends
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "Madam";
        String input2 = "A man, a plan, a canal, Panama";
        String input3 = "Hello";

        System.out.println(isPalindrome(input1)); // true
        System.out.println(isPalindrome(input2)); // true
        System.out.println(isPalindrome(input3)); // false
    }
}

