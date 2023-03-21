package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1331 {
	public int[] arrayRankTransform(int[] arr) {
		int[] copy = arr.clone();
		Arrays.sort(arr);
		Map<Integer, Integer> ranks = new HashMap<>();
		int position = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!ranks.containsKey(arr[i])) {
				ranks.put(arr[i], position++);
			}
		}
		for (int i = 0; i < copy.length; i++) {
			arr[i] = ranks.get(copy[i]);
		}
		return arr;
	}
}

public class Rank_Transform_of_an_Array_1331 {

	public static void main(String[] args) {
		int arr[] = { 37, 12, 28, 9, 100, 56, 80, 5, 12 };
		Solution1331 ns = new Solution1331();
		System.out.println(Arrays.toString(ns.arrayRankTransform(arr)));
	}

}
