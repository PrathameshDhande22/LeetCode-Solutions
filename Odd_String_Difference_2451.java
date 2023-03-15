package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution2451 {
	public String oddString(String[] words) {
		List<List<Integer>> storeing = new ArrayList<>();
		Map<List<Integer>, Integer> mapper = new HashMap<>();
		int j = 0;
		for (String s : words) {
			List<Integer> store = new ArrayList<>();
			for (int i = 0; i < s.length() - 1; i++) {
				int abs = (s.charAt(i + 1) - 'a') - (s.charAt(i) - 'a');
				store.add(abs);
			}
			storeing.add(store);
			mapper.put(store, mapper.getOrDefault(store, 0) + 1);
		}
		for (List<Integer> ll : mapper.keySet()) {
			if (mapper.get(ll) == 1) {
				return words[storeing.indexOf(ll)];
			}
		}
		return "";
	}
}

public class Odd_String_Difference_2451 {

	public static void main(String[] args) {
		String[] words = { "aaa", "bob", "ccc", "ddd" };
		Solution2451 ns = new Solution2451();
		System.out.println(ns.oddString(words));

	}

}
