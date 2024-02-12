package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

class Solution3033 {
	public int[][] modifiedMatrix(int[][] matrix) {
		// iterating through column
		for (int col = 0; col < matrix[0].length; col++) {
			int max = 0;
			ArrayList<Integer> idx = new ArrayList<Integer>();

			// iterating through row
			for (int row = 0; row < matrix.length; row++) {
				int currElement = matrix[row][col];
				max = Math.max(max, currElement);

				// add the index of the found -1.
				if (currElement == -1) {
					idx.add(row);
				}
			}

			// iterating through the index of the -1 element
			for (int index : idx) {
				matrix[index][col] = max;
			}
		}

		return matrix;
	}
}

public class Modify_the_Matrix_3033 {

	public static void main(String[] args) {
		int[][] arr = { { 3, -1 }, { 5, 2 } };
		;
		;
		Solution3033 ns = new Solution3033();
		int[][] ans = ns.modifiedMatrix(arr);
		for (int[] a : ans) {
			System.out.println(Arrays.toString(a));
		}
	}

}
