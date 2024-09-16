package org.demo.com;
//8) Modify the previous assignment to use getter and setter methods instead of acceptRecord and printRecord.

import java.util.Scanner;

class TArrayHandler {
	private int[] numbers;

	public TArrayHandler(int size) {
		numbers = new int[size]; // Instantiate the array in the constructor
	}

	public void setNumber(int index, int value) {
		if (index >= 0 && index < numbers.length) {
			numbers[index] = value;
		} else {
			System.out.println("Index out of bounds");
		}
	}

	public int getNumber(int index) {
		if (index >= 0 && index < numbers.length) {
			return numbers[index];
		} else {
			System.out.println("Index out of bounds");
			return -1; // Return -1 in case of an invalid index
		}
	}
}

public class TestArrayHandler1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayHandler arrayHandler = new ArrayHandler(5); // Array of size 5

		System.out.println("Enter 5 numbers:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number at index " + i + ": ");
			int value = scanner.nextInt();
			arrayHandler.setNumber(i, value);
		}

		System.out.println("The numbers in the array are:");
		for (int i = 0; i < 5; i++) {
			System.out.println("Element at index " + i + ": " + arrayHandler.getNumber(i));
		}
	}
}