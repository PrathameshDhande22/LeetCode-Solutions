package leetcode;

class Solution1351 {
	public int countNegatives(int[][] grid) {
		int count = 0;
		for (int row[] : grid) {
			for (int no : row) {
				if (no < 0) {
					count++;
				}
			}
		}
		return count;
	}
}

public class Count_Negative_Numbers_in_a_Sorted_Matrix_1351 {

	public static void main(String[] args) {
		int[][] grid = {{3,2},{1,0}};
		Solution1351 ns = new Solution1351();
		System.out.println(ns.countNegatives(grid));
	}

}
