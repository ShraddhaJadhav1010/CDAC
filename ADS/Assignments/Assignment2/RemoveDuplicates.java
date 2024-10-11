package Assignment2;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2}; // You can change this array to test with different inputs
        int newLength = removeDuplicates(arr);

        System.out.println("New length of the array: " + newLength);
        System.out.print("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to remove duplicates from a sorted array
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0; // Return 0 for an empty array
        }

        int uniqueIndex = 1; // The index to place the next unique element
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueIndex] = arr[i]; // Place the unique element in its correct position
                uniqueIndex++;
            }
        }
        
        return uniqueIndex; // Return the length of the array after removing duplicates
    }
}
