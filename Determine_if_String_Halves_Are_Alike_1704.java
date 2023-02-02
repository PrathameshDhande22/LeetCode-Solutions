package leetcode;

class Solution1704 {

	public boolean halvesAreAlike(String s) {
		String first = s.substring(0, Math.abs(s.length() / 2));
		String last = s.substring(Math.abs(s.length() / 2), s.length());
		if (count(last) == count(first)) {
			return true;
		}
		return false;
	}

	private int count(String splitted) {
		int ans = 0;
		for (int i = 0; i < splitted.length(); i++) {
			char current = splitted.charAt(i);
			if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u' || current == 'A'
					|| current == 'E' || current == 'I' || current == 'O' || current == 'U') {
				ans++;
			}
		}
		return ans;
	}
}

public class Determine_if_String_Halves_Are_Alike_1704 {

	public static void main(String[] args) {
		String s = "textbook";
		Solution1704 ns = new Solution1704();
		System.out.println(ns.halvesAreAlike(s));
	}

}
