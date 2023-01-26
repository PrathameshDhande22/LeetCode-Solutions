package leetcode;

class Solution1221 {
	public int balancedStringSplit(String s) {
		int cnt = 0, res = 0;
		for (int i = 0; i < s.length(); i++) {
			cnt += s.charAt(i) == 'L' ? 1 : -1;
			if (cnt == 0)
				res++;
		}
		return res;
	}
}

public class Split_a_String_in_Balanced_Strings_1221 {

	public static void main(String[] args) {
		Solution1221 ns = new Solution1221();
		System.out.println(ns.balancedStringSplit("RLRRRLLRLL"));
	}

}
