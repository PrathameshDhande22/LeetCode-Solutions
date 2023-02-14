package leetcode;

import java.util.HashSet;
import java.util.Set;

class Solution1935 {
	private Set<Character> broke = new HashSet<>();

	public int canBeTypedWords(String text, String brokenLetters) {
		int ans = 0;
		for (char c : brokenLetters.toCharArray())
			broke.add(c);
		for (String word : text.split("\s")) {
			if (!containsBroken(word)) {
				ans++;
			}
		}
		return ans;
	}

	public boolean containsBroken(String word) {
		for (char cs : word.toCharArray()) {
			if (broke.contains(cs)) {
				return true;
			}
		}
		return false;
	}
}

public class Maximum_Number_of_Words_You_Can_Type_1935 {

	public static void main(String[] args) {
		String text = "leet code";
		String broken = "e";
		Solution1935 ns = new Solution1935();
		System.out.println(ns.canBeTypedWords(text, broken));
	}

}
