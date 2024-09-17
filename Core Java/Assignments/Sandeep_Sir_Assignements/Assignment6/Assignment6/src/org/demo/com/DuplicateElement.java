package org.demo.com;
import java.util.*;

public class DuplicateElement {
	public static void main(String[] args) {
	int[] array = new int[10];

	acceptRecord(array);

	int[] uniqueArray = removeDuplicates(array);

	printRecord(uniqueArray);
}

public static void acceptRecord(int[] array) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 10 integers (duplicates allowed):");
	for (int i = 0; i < array.length; i++) {
		array[i] = sc.nextInt();
	}
}

public static int[] removeDuplicates(int[] array) {
	int n = array.length;
	int[] temp = new int[n];
	int j = 0;

	for (int i = 0; i < n; i++) {
		boolean isDuplicate = false;

		for (int k = 0; k < j; k++) {
			if (array[i] == temp[k]) {
				isDuplicate = true;
				break;
			}
		}

		if (!isDuplicate) {
			temp[j++] = array[i];
		}
	}

	int[] uniqueArray = new int[j];
	for (int i = 0; i < j; i++) {
		uniqueArray[i] = temp[i];
	}

	return uniqueArray;
}

public static void printRecord(int[] array) {
	System.out.println("Array after removing duplicates:");
	for (int value : array) {
		System.out.print(value + " ");
	}
	System.out.println(); // For a newline
}
}

