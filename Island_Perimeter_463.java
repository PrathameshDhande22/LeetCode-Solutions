package leetcode;

class Solution463 {
	public int islandPerimeter(int[][] grid) {
		int perimeter = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					perimeter += getCurrentPeri(i, j, grid);
				}
			}
		}
		return perimeter;
	}

	public int getCurrentPeri(int row, int col, int[][] grid) {
		int up = row - 1, down = row + 1, left = col - 1, right = col + 1;
		int count = 0;

		// checking the up direction
		if (up >= 0) {
			if (grid[up][col] == 1) {
				count++;
			}
		}

		// checking the down direction
		if (down < grid.length) {
			if (grid[down][col] == 1) {
				count++;
			}
		}

		// checking the left direction
		if (left >= 0) {
			if (grid[row][left] == 1) {
				count++;
			}
		}

		// checking the right direction
		if (right < grid[0].length) {
			if (grid[row][right] == 1) {
				count++;
			}
		}
		return (4 - count);
	}
}

public class Island_Perimeter_463 {

	public static void main(String[] args) {
		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		Solution463 ns = new Solution463();
		System.out.println(ns.islandPerimeter(grid));
	}

}
