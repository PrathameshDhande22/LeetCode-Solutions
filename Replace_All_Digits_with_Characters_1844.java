package leetcode;

class Solution1844 {
	public String replaceDigits(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				sb.append(s.charAt(i));
			} else {
				sb.append(shift(s.charAt(i - 1), Character.getNumericValue(s.charAt(i))));
			}
		}
		return sb.toString();
	}

	public char shift(char ori, int shifter) {
		return (char) (ori + shifter);
	}
}

public class Replace_All_Digits_with_Characters_1844 {

	public static void main(String[] args) {
		String s = "a1c1e1";
		Solution1844 ns = new Solution1844();
		System.out.println(ns.replaceDigits(s));
	}

}
