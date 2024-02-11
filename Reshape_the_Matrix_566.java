package leetcode;

import java.util.Arrays;

class Solution566 {
	public int[][] matrixReshape(int[][] mat, int r, int c) {

		int[][] ans = new int[r][c];
		int mat_row = mat.length;
		int mat_col = mat[0].length;

		if (r * c != mat_row * mat_col) {
			return mat;
		}

		int m_r = 0;
		int m_c = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ans[i][j] = mat[m_r][m_c++];
				if (m_c >= mat_col) {
					m_r++;
					m_c = 0;
				}
			}
		}
		return ans;
	}
}

public class Reshape_the_Matrix_566 {

	public static void main(String[] args) {
		Solution566 ns = new Solution566();
		int[][] mat = { { 1, 2 ,5}, { 3, 4,5 } };
		int[][] reshape = ns.matrixReshape(mat, 2, 2);
		for (int[] inmat : reshape) {
			System.out.println(Arrays.toString(inmat));
		}

	}

}
