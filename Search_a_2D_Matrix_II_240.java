package leetcode;

class Solution240 {
	public boolean searchMatrix(int[][] matrix, int target) {
		int row = 0;
		int cols = matrix[0].length - 1;
		while (row < matrix.length && cols >= 0) {
			if (matrix[row][cols] == target) {
				return true;
			} else if (matrix[row][cols] > target) {
				cols--;
			} else {
				row++;
			}
		}
		return false;
	}
}

public class Search_a_2D_Matrix_II_240 {

	public static void main(String[] args) {
		Solution240 ns = new Solution240();
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		System.out.println(ns.searchMatrix(arr, 233));

	}

}
