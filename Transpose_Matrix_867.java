package leetcode;

import java.util.Arrays;

class Solution867 {
	public int[][] transpose(int[][] matrix) {
		int transposemat[][] = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < transposemat.length; i++) {
			for (int j = 0; j < transposemat[0].length; j++) {
				transposemat[i][j] = matrix[j][i];
			}
		}
		return transposemat;
	}
}

public class Transpose_Matrix_867 {
	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int matrix[][] = new Solution867().transpose(mat);
		for (int mats[] : matrix) {
			System.out.println(Arrays.toString(mats));
		}
	}
}
