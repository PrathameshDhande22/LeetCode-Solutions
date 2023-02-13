package leetcode;

class Solution2124 {
	public boolean checkString(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') {
				return false;
			}
		}
		return true;
	}
}

public class Check_if_All_As_Appears_Before_All_Bs_2124 {

	public static void main(String[] args) {
		String s = "baba";
		Solution2124 ns = new Solution2124();
		System.out.println(ns.checkString(s));
	}

}
