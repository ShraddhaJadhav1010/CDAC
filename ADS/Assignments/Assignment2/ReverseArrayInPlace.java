package Assignment2;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // You can change this array to test with different inputs
        reverseArray(arr);
        
        // Print the reversed array
        System.out.print("Reversed array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Function to reverse an array in place
    public static void reverseArray(int[] arr) {
        int left = 0; // Start from the first element
        int right = arr.length - 1; // Start from the last element
        
        // Swap elements from both ends of the array until the pointers meet
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
