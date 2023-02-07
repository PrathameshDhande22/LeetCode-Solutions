package leetcode;

class Solution2255 {
	public int countPrefixes(String[] words, String s) {
		int count = 0;
		for (String wor : words) {
			if (s.startsWith(wor)) {
				count++;
			}
		}
		return count;
	}
}

public class Count_Prefixes_of_a_Given_String_2255 {

	public static void main(String[] args) {
		String[] words = { "a", "a" };
		Solution2255 ns = new Solution2255();
		System.out.println(ns.countPrefixes(words, "aa"));
	}

}
