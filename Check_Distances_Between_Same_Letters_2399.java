package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution2399 {
	public boolean checkDistances(String s, int[] distance) {
		Map<Character, Integer> store = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (!store.containsKey(current)) {
				store.put(current, i + 1);
			} else {
				if (distance[current - 'a'] != i - store.get(current)) {
					return false;
				}
			}
		}
		return true;
	}
}

public class Check_Distances_Between_Same_Letters_2399 {

	public static void main(String[] args) {
		String s = "aa";
		int[] distances = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		Solution2399 ns = new Solution2399();
		System.out.println(ns.checkDistances(s, distances));
	}

}
