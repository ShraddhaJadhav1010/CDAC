package Assignment2;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // You can change this array to test with different inputs
        int d = 2; // Number of positions to rotate
        
        rotateLeft(arr, d);
        
        // Print the rotated array
        System.out.print("Rotated array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Function to perform left rotation by d positions
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // To handle cases where d is greater than the array size
        
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        
        // Reverse the first part (0 to d-1)
        reverse(arr, 0, d - 1);
        
        // Reverse the second part (d to n-1)
        reverse(arr, d, n - 1);
    }

    // Helper function to reverse a part of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } 
}
