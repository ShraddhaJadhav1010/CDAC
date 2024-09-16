//1) Declare a single-dimensional array of 5 integers inside the main method. Traverse the array to print the default values. Then accept records from the user and print the updated values of the array.
	

package org.demo.com;
import java.util.*;
public class ArrayExample {
	public static void main(String[] args) {
		int[] numbers = new int[5];

		System.out.println("Default values in the array:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 5 integers to update the array:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter integer for index " + i + ": ");
			numbers[i] = scanner.nextInt();
		}
		scanner.close();

		System.out.println("Updated values in the array:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
	}
}
