package Assignment2;

public class StringPalindrome {
    public static void main(String[] args) {
        String input = "madam"; // You can change this string to test with different inputs
        boolean isPalindrome = checkPalindrome(input);
        
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0; // Start pointer from the beginning
        int right = str.length() - 1; // End pointer from the last character

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If all characters match, it's a palindrome
    }
}
