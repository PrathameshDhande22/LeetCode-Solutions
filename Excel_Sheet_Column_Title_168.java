package leetcode;

class Solution168 {
	public String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();

		while (columnNumber > 0) {
			int rem = columnNumber % 26;
			if (rem == 0) {
				sb.insert(0, 'Z');
				columnNumber = (columnNumber / 26) - 1;
			} else {

				sb.insert(0, (char) ((rem - 1) + 'A'));
				columnNumber /= 26;
			}
		}
		return sb.toString();
	}
}

public class Excel_Sheet_Column_Title_168 {

	public static void main(String[] args) {
		int columnNumber = 504;
		Solution168 ns = new Solution168();
		System.out.println(ns.convertToTitle(columnNumber));
	}

}
