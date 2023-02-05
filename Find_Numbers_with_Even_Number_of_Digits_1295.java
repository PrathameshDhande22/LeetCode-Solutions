package leetcode;

class Solution1295 {
	public int findNumbers(int[] nums) {
		int count = 0;
		for (int no : nums) {
			String con = Integer.toString(no);
			if (con.length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}

public class Find_Numbers_with_Even_Number_of_Digits_1295 {
	public static void main(String[] args) {
		int[] nums = { 555, 901, 482, 1771 };
		Solution1295 ns = new Solution1295();
		System.out.println(ns.findNumbers(nums));
	}
}
