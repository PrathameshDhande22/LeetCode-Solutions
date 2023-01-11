package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution1207 {
	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> occur = new HashMap<>();
		for (int a : arr) {
			if (occur.containsKey(a)) {
				occur.put(a, occur.get(a) + 1);
			} else {
				occur.put(a, 1);
			}
		}
		Set<Integer> oc = new HashSet<>(occur.values());
		return occur.size() == oc.size();
	}
}

public class Unique_Number_of_Occurrences_1207 {

	public static void main(String[] args) {
//		int arr[]= {1,2,2,1,1,3};
//		int arr[]= {1,2};
		int arr[] = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
		Solution1207 ns = new Solution1207();
		System.out.println(ns.uniqueOccurrences(arr));
	}

}
