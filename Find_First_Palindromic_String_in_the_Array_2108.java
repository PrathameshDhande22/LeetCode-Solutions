package leetcode;

class Solution2108 {
	public String firstPalindrome(String[] words) {
		for (String s : words) {
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			if (sb.toString().equals(s)) {
				return s;
			}
		}
		return "";
	}
}

public class Find_First_Palindromic_String_in_the_Array_2108 {

	public static void main(String[] args) {
		Solution2108 ns = new Solution2108();
		String[] words = { "def", "ghi" };
		System.out.println(ns.firstPalindrome(words));
	}

}
