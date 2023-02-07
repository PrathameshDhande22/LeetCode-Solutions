package leetcode;

import java.util.HashSet;
import java.util.Set;

class Solution2351 {
	public char repeatedCharacter(String s) {
		Set<Character> sChar = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (sChar.contains(c)) {
				return c;
			} else {
				sChar.add(c);
			}
		}
		return 0;
	}
}

public class First_Letter_to_Appear_Twice_2351 {

	public static void main(String[] args) {
		Solution2351 ns = new Solution2351();
		System.out.println(ns.repeatedCharacter("abcdd"));
	}

}
