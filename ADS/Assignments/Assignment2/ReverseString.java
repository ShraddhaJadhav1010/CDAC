package Assignment2;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello"; // You can change this string to test with different inputs
        String reversed = reverse(input);
        
        System.out.println("Reversed string: " + reversed);
    }

    // Function to reverse a string without using inbuilt functions
    public static String reverse(String str) {
        char[] charArray = str.toCharArray(); // Convert string to character array
        int left = 0; // Start from the first character
        int right = charArray.length - 1; // Start from the last character
        
        // Swap characters until the pointers meet in the middle
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        // Convert the character array back to a string and return
        return new String(charArray);
    } 
}
