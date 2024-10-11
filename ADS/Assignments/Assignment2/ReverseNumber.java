package Assignment2;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345; // You can change this number to test with different inputs
        int reversed = reverse(number);
        
        System.out.println("Reversed number: " + reversed);
    }

    // Function to reverse a number
    public static int reverse(int number) {
        int reversed = 0;
        int sign = (number < 0) ? -1 : 1; // Store the sign of the number
        number = Math.abs(number); // Make the number positive for processing

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Add the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        
        return reversed * sign; // Return the reversed number with the original sign
    }
}
