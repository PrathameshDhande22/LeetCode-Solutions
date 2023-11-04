package leetcode;

import java.util.*;

class Solution49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();

		for (String word : strs) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String new_word = new String(chars);

			if (!hm.containsKey(new_word)) {
				hm.put(new_word, new ArrayList<String>());
			}
			hm.get(new_word).add(word);
		}
		return new ArrayList<List<String>>(hm.values());
	}
}

public class Group_Anagrams_49 {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		Solution49 sn = new Solution49();
		System.out.println(sn.groupAnagrams(strs));
	}

}
