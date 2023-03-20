package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution2085 {
	public int countWords(String[] words1, String[] words2) {
		Map<String, Integer> occurword1 = new HashMap<>();
		Map<String, Integer> occurword2 = new HashMap<>();
		// counting on words1
		for (String w : words1) {
			occurword1.put(w, occurword1.getOrDefault(w, 0) + 1);
		}
		// counting on words2
		for (String w : words2) {
			occurword2.put(w, occurword2.getOrDefault(w, 0) + 1);
		}

		int count = 0;
		for (String word : occurword1.keySet()) {
			if (occurword1.get(word) == 1 && occurword2.getOrDefault(word, 0) == 1) {
				count++;
			}
		}
		return count;
	}
}

public class Count_Common_Words_With_One_Occurrence_2085 {

	public static void main(String[] args) {
		String[] words1 = { "leetcode", "is", "amazing", "as", "is" };
		String[] words2 = { "amazing", "leetcode", "is" };
		Solution2085 ns = new Solution2085();
		System.out.println(ns.countWords(words1, words2));
	}

}
