package leetcode;

class Solution2315 {
	public int countAsterisks(String s) {
		int ans = 0;
		boolean barAppear = false;
		for (char a : s.toCharArray()) {
			if (a == '|' && !barAppear) {
				barAppear = true;
			} else if (barAppear && a == '|') {
				barAppear = false;
			} else if (!barAppear) {
				if (a == '*') {
					ans++;
				}
			}
		}
		return ans;
	}
}

public class Count_Asterisks_2315 {

	public static void main(String[] args) {
		Solution2315 ns = new Solution2315();
		System.out.println(ns.countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
	}

}
