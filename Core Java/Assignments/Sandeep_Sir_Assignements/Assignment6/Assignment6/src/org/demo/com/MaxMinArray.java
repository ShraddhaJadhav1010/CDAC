//3) Write a program to find the maximum and minimum values in a single-dimensional array of integers.

package org.demo.com;
import java.util.Scanner;
public class MaxMinArray {
	public static void main(String[] args) {
		int[] array = new int[5];

		acceptRecord(array);

		int max = findMax(array);
		int min = findMin(array);

		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);
	}

	public static void acceptRecord(int[] array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
	}

	public static int findMax(int[] array) {
		int max = array[0]; // Assume the first element is the max
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i]; // Update max if current element is greater
			}
		}
		return max;
	}

	public static int findMin(int[] array) {
		int min = array[0]; // Assume the first element is the min
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i]; // Update min if current element is smaller
			}
		}
		return min;
	}
}
