package Assignment2;

public class ArrayManipulation {
    public static void main(String[] args) {
        int n = 5; // Size of the array
        int[][] queries = {
            {1, 2, 100},
            {2, 5, 100},
            {3, 4, 100}
        };
        
        long result = arrayManipulation(n, queries);
        
        System.out.println("Maximum value in the array: " + result);
    }

    // Function to perform the range updates and find the maximum value
    public static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 1]; // Create an array of size n+1 to handle range updates efficiently

        // Apply the queries
        for (int[] query : queries) {
            int start = query[0] - 1; // Start index (0-based)
            int end = query[1]; // End index (exclusive, so no need to subtract 1)
            int value = query[2]; // Value to be added

            arr[start] += value; // Add value to the start index
            if (end < n) {
                arr[end] -= value; // Subtract value from the position right after the end index
            }
        }

        // Find the maximum value in the array using a prefix sum approach
        long max = 0;
        long currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            max = Math.max(max, currentSum); // Track the maximum value
        }

        return max; // Return the maximum value in the array
    }
}
