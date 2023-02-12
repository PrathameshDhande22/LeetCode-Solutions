package leetcode;

class Solution2129 {
	public String capitalizeTitle(String title) {
		String ans = "";
		String[] tSplited = title.split("\s");
		for (int i = 0; i < tSplited.length; i++) {
			if (tSplited[i].length() == 1 || tSplited[i].length() == 2) {
				ans += tSplited[i].toLowerCase();
			} else {
				ans += tSplited[i].substring(0, 1).toUpperCase()
						+ tSplited[i].substring(1, tSplited[i].length()).toLowerCase();
			}
			if (i != tSplited.length - 1) {
				ans += " ";
			}
		}
		return ans;
	}
}

public class Capitalize_the_Title_2129 {

	public static void main(String[] args) {
		String title = "First leTTeR of EACH Word";
		Solution2129 ns = new Solution2129();
		System.out.println(ns.capitalizeTitle(title));
	}

}
