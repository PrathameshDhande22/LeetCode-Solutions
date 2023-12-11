package leetcode;

import java.util.HashMap;

class Solution1287 {
	public int findSpecialInteger(int[] arr) {
		HashMap<Integer, Integer> occ = new HashMap<Integer, Integer>();
		for (int no : arr) {
			occ.put(no, occ.getOrDefault(no, 0) + 1);
		}
		int maxcounts[] = new int[2];
		for (int no : occ.keySet()) {
			int freq = occ.get(no);
			if (maxcounts[1] < freq) {
				maxcounts[1] = freq;
				maxcounts[0] = no;
			}
		}
		return maxcounts[0];
	}
}

public class Element_Appearing_More_Than_25per_In_Sorted_Array_1287 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3 };
		Solution1287 ns = new Solution1287();
		System.out.println(ns.findSpecialInteger(arr));
	}

}
