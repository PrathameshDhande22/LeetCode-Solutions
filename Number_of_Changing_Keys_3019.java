package leetcode;

class Solution3019 {
	public int countKeyChanges(String s) {
		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				count++;
			}
		}
		return count;
	}
}

public class Number_of_Changing_Keys_3019 {

	public static void main(String[] args) {
		String s = "aBa";
		Solution3019 ns = new Solution3019();
		System.out.println(ns.countKeyChanges(s));
	}

}
