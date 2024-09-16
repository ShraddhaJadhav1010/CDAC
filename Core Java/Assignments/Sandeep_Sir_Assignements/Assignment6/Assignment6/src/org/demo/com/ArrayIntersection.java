package org.demo.com;
import java.util.Arrays;
public class ArrayIntersection {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {3, 4, 5, 6, 7};

		int[] intersection = findIntersection(array1, array2);

		System.out.println("Intersection of the two arrays: " + Arrays.toString(intersection));
	}

	public static int[] findIntersection(int[] arr1, int[] arr2) {
		int[] temp = new int[Math.min(arr1.length, arr2.length)];
		int k = 0; // index for temp array

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					boolean alreadyAdded = false;
					for (int x = 0; x < k; x++) {
						if (temp[x] == arr1[i]) {
							alreadyAdded = true;
							break;
						}
					}
					if (!alreadyAdded) {
						temp[k++] = arr1[i];
					}
				}
			}
		}

		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = temp[i];
		}

		return result;
	}
}
