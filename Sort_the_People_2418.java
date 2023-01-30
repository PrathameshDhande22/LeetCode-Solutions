package leetcode;

import java.util.Arrays;
import java.util.HashMap;

class Solution2418 {
	public String[] sortPeople(String[] names, int[] heights) {
		String[] ans = new String[names.length];
		HashMap<Integer, String> storage = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			storage.put(heights[i], names[i]);
		}
		int[] sorted = descSortHeights(heights);
		for (int i = 0; i < sorted.length; i++) {
			ans[i] = storage.get(sorted[i]);
		}
		return ans;
	}

	private int[] descSortHeights(int[] heights) {
		Arrays.sort(heights);
		int index = 0;
		int[] ans = new int[heights.length];
		for (int i = ans.length - 1; i >= 0; i--) {
			ans[i] = heights[index];
			index++;
		}
		return ans;
	}
}

public class Sort_the_People_2418 {

	public static void main(String[] args) {
		String[] names = { "Alice", "Bob", "Bob" };
		int[] heights = { 155, 185, 150 };
		Solution2418 ns = new Solution2418();
		System.out.println(Arrays.toString(ns.sortPeople(names, heights)));
	}

}
