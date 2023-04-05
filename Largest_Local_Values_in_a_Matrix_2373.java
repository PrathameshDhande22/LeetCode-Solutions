package leetcode;

import java.util.Arrays;

class Solution2373 {
	public int[][] largestLocal(int[][] grid) {
		int size = grid.length - 2;
		int[][] maxLocal = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				maxLocal[i][j] = largestValue(grid, i, j);
			}
		}
		return maxLocal;
	}

	public int largestValue(int[][] grid, int startrow, int startcol) {
		int max = Integer.MIN_VALUE;
		for (int i = startrow; i < startrow + 3; i++) {
			for (int j = startcol; j < startcol + 3; j++) {
				max = Math.max(grid[i][j], max);
			}
		}
		return max;
	}
}

public class Largest_Local_Values_in_a_Matrix_2373 {

	public static void main(String[] args) {
		int[][] grid = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 2, 1, 1 }, { 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1 } };
		int[][] answer = new Solution2373().largestLocal(grid);
		for (int[] arr : answer) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
