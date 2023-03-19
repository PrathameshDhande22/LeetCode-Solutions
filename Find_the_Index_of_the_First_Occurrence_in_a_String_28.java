package leetcode;

class Solution28 {
	public int strStr(String haystack, String needle) {
		return haystack.contains(needle) ? haystack.indexOf(needle) : -1;
	}
}

public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {

	public static void main(String[] args) {
		String haystack = "leetcode";
		String needle = "leeto";
		Solution28 ns = new Solution28();
		System.out.println(ns.strStr(haystack, needle));
	}

}
