package leetcode;

import java.util.HashMap;
import java.util.HashSet;

class Solution2103 {
	public int countPoints(String rings) {
		HashMap<Integer, HashSet<Character>> storage = new HashMap<>();
		int count = 0;
		for (int i = 0; i < rings.length(); i += 2) {
			int key = Character.getNumericValue(rings.charAt(i + 1));
			if (storage.containsKey(key)) {
				storage.get(key).add(rings.charAt(i));
			} else {
				HashSet<Character> color = new HashSet<>();
				color.add(rings.charAt(i));
				storage.put(key, color);
			}
		}
		for (int rods : storage.keySet()) {
			if (storage.get(rods).size() == 3) {
				count++;
			}
		}
		return count;
	}
}

public class Rings_and_Rods_2103 {

	public static void main(String[] args) {
		String rings = "G4";
		Solution2103 ns = new Solution2103();
		System.out.println(ns.countPoints(rings));
	}

}
