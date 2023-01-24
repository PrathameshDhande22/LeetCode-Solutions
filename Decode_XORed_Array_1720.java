package leetcode;

import java.util.Arrays;

class Solution1720 {
	public int[] decode(int[] encoded, int first) {
		int arr[] = new int[encoded.length + 1];
		arr[0] = first;
		for (int i = 0; i < encoded.length; i++) {
			arr[i + 1] = arr[i] ^ encoded[i];
		}
		return arr;
	}
}

public class Decode_XORed_Array_1720 {

	public static void main(String[] args) {
		int[] encoded = { 6, 2, 7, 3 };
		Solution1720 ns = new Solution1720();
		System.out.println(Arrays.toString(ns.decode(encoded, 4)));
	}

}
