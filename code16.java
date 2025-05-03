//Write a Java function that takes a string and returns the total count of palindromic substrings in it. A palindrome is a substring that reads the same backward as forward. The function should count all possible palindromic substring.
 class PalindromicSubstrings {

     static int countPalindromicSubstrings(String input) {
        int n = input.length();
        int count = 0;

        // Check for odd-length palindromes (centered at each character)
        for (int center = 0; center < n; center++) {
            // Expand around the center for odd-length palindromes
            count += expandAroundCenter(input, center, center);
            
            // Expand around the center for even-length palindromes
            count += expandAroundCenter(input, center, center + 1);
        }

        return count;
    }

    // Helper function to count palindromes centered at left and right
    private static int expandAroundCenter(String input, int left, int right) {
        int count = 0;

        // Expand as long as the characters match and indices are valid
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            count++;
            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
        String input1 = "abcba";
        String input2 = "aaa";

        System.out.println("Total palindromic substrings in '" + input1 + "' : " + countPalindromicSubstrings(input1));
        System.out.println("Total palindromic substrings in '" + input2 + "' : " + countPalindromicSubstrings(input2));
    }
}

