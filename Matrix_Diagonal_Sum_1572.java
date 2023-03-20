package leetcode;

class Solution1572 {
	public int diagonalSum(int[][] mat) {
		int sum = 0;
		int last = 0;
		for (int i = 0; i < mat.length; i++) {
			last = mat.length - 1 - i;
			sum += mat[i][i];
			if (i != last) {
				sum += mat[i][last];
			}
		}
		return sum;
	}
}

public class Matrix_Diagonal_Sum_1572 {

	public static void main(String[] args) {
		int[][] mat = { { 5 } };
		Solution1572 ns = new Solution1572();
		System.out.println(ns.diagonalSum(mat));
	}

}
