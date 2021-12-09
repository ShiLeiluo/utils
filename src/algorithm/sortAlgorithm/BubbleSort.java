package algorithm.sortAlgorithm;

import java.util.Arrays;

/**
 * @author ShiLeiluo
 * @version 2021-11-05 20:58
 * @description
 */
public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = { 7, 2, 8, 1, 0, 5, 3, 6, 4, 10 };
		System.out.println("排序前。");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("排序后。");
		System.out.println(Arrays.toString(arr));

	}
}
