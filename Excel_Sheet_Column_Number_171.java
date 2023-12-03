package leetcode;

class Solution171 {
	public int titleToNumber(String columnTitle) {
		int sum = 0;
		for (int i = 0; i < columnTitle.length(); i++) {
			int alphaChar = (int) (columnTitle.charAt(i) - 'A') + 1;
			sum *= 26;
			sum += alphaChar;
		}
		return sum;
	}
}

public class Excel_Sheet_Column_Number_171 {

	public static void main(String[] args) {
		String columnTitle = "ST";
		Solution171 ns = new Solution171();
		System.out.println(ns.titleToNumber(columnTitle));
	}

}
