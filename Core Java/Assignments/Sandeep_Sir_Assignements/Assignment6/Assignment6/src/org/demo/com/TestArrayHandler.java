//7) Declare a single-dimensional array as a field inside a class and instantiate it inside the class constructor. Define methods named acceptRecord and printRecord within the class and test their functionality.


package org.demo.com;
import java.util.*;
class ArrayHandler {
	private int[] numbers;

	public ArrayHandler(int size) {
		numbers = new int[size]; // Instantiate the array in the constructor
	}

	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter " + numbers.length + " numbers:");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number at index " + i + ": ");
			numbers[i] = scanner.nextInt();
		}
	}

	public void printRecord() {
		System.out.println("The numbers in the array are:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
	}

	public String getNumber(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNumber(int i, int value) {
		// TODO Auto-generated method stub
		
	}
}
public class TestArrayHandler {
	public static void main(String[] args) {
		ArrayHandler arrayHandler = new ArrayHandler(5); // Array of size 5

		arrayHandler.acceptRecord();
		arrayHandler.printRecord();
	}
}
