package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution2828 {
	public boolean isAcronym(List<String> words, String s) {
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word.charAt(0));
		}
		return sb.toString().equals(s);
	}
}

public class Check_if_a_String_Is_an_Acronym_of_Words_2828 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		Collections.addAll(words, "an", "apple");
		String s = "aa";
		Solution2828 ns = new Solution2828();
		System.out.println(ns.isAcronym(words, s));
	}

}
