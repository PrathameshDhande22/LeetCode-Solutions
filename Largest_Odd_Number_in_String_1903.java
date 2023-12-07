package leetcode;

class Solution1903 {
	public String largestOddNumber(String num) {
		int i = num.length() - 1;
		while (i >= 0) {
			int lastno = Character.getNumericValue(num.charAt(i));
			if (lastno % 2 == 1) {
				return num.substring(0, i + 1);
			}
			i--;
		}
		return "";
	}
}

public class Largest_Odd_Number_in_String_1903 {

	public static void main(String[] args) {
		String num = "35427";
		Solution1903 ns = new Solution1903();
		System.out.println(ns.largestOddNumber(num));
	}

}
