package leetcode;

class Solution1252 {
	public int oddCells(int m, int n, int[][] indices) {
		int count = 0;
		int[][] matrix = new int[m][n];
		for (int i = 0; i < indices.length; i++) {
			int row = indices[i][0];
			int col = indices[i][1];
			// incrementing row
			for (int r = 0; r < n; r++) {
				matrix[row][r]++;
			}
			// incrementing column
			for (int c = 0; c < m; c++) {
				matrix[c][col]++;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] % 2 == 1) {
					count++;
				}
			}
		}
		return count;
	}
}

public class Cells_with_Odd_Values_in_a_Matrix_1252 {

	public static void main(String[] args) {
		int[][] indices = { { 40, 5 } };
		int m = 48;
		int n = 37;
		Solution1252 ns = new Solution1252();
		System.out.println(ns.oddCells(m, n, indices));
	}

}
