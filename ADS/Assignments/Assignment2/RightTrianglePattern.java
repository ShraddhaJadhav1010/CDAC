package Assignment2;

public class RightTrianglePattern {
    public static void main(String[] args) {
        int n = 5; // You can change this value to test with different inputs
        printRightTriangle(n);
    }

    // Function to print a right triangle of stars
    public static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // Print i stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
