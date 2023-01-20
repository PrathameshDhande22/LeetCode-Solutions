package leetcode;

class Solution1528 {
	public String restoreString(String s, int[] indices) {
		StringBuilder sb = new StringBuilder();
		char[] res = new char[indices.length];
		for (int i = 0; i < indices.length; i++) {
			res[indices[i]] = s.charAt(i);

		}
		for (char a : res) {
			sb.append(a);
		}
		return sb.toString();
	}
}

public class Shuffle_String_1528 {

	public static void main(String[] args) {
		String s = "abc";
		int[] indices = { 0, 1, 2 };
		Solution1528 ns = new Solution1528();
		System.out.println(ns.restoreString(s, indices));
	}

}
