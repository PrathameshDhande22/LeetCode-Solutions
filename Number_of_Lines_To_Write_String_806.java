package leetcode;

import java.util.Arrays;

class Solution806 {
	public int[] numberOfLines(int[] widths, String s) {
		int line = 1, pixels = 0;
		for (int i = 0; i < s.length(); i++) {
			int no = widths[s.charAt(i) - 'a'];
			pixels += no;
			if (pixels > 100) {
				line++;
				pixels = no;
			}

		}
		return new int[] { line, pixels };
	}
}

public class Number_of_Lines_To_Write_String_806 {

	public static void main(String[] args) {
		int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10 };
		String s = "bbbcccdddaaa";
		Solution806 ns = new Solution806();
		System.out.println(Arrays.toString(ns.numberOfLines(widths, s)));
	}

}
