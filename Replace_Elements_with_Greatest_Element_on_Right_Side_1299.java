package leetcode;

import java.util.Arrays;

class Solution1299 {
	public int[] replaceElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = maxElement(arr, i + 1);
			if (arr[i] == 0) {
				arr[i] = -1;
			}
		}
		return arr;
	}

	public int maxElement(int[] ar, int pos) {
		int max = 0;
		for (int i = pos; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}
}

public class Replace_Elements_with_Greatest_Element_on_Right_Side_1299 {

	public static void main(String[] args) {
		int[] arr = { 400 };
		Solution1299 ns = new Solution1299();
		System.out.println(Arrays.toString(ns.replaceElements(arr)));
//		System.out.println(ns.maxElement(arr, 6));
	}

}
