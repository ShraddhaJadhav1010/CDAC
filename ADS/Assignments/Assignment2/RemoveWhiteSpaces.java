package Assignment2;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String input = "  Java   Programming  "; // You can change this string to test with different inputs
        String result = removeWhiteSpaces(input);
        
        System.out.println("String after removing white spaces: " + result);
    }

    // Function to remove all white spaces from the string
    public static String removeWhiteSpaces(String str) {
        return str.replaceAll("\\s+", ""); // Replace all white space characters with an empty string
    }   
}
