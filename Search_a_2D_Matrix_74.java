package leetcode;

class Solution74 {
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

public class Search_a_2D_Matrix_74 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		Solution74 ns = new Solution74();
		System.out.println(ns.searchMatrix(matrix, 16));
	}

}
