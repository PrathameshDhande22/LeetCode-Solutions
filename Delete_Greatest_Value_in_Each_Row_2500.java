package leetcode;

class Solution2500 {
	public int deleteGreatestValue(int[][] grid) {
		int iter = 0;
		int ans = 0;
		while (iter < grid[0].length) {
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < grid.length; i++) {
				int maxRow = Integer.MIN_VALUE;
				int maxIndex = 0;
				for (int j = 0; j < grid[0].length; j++) {
					if (grid[i][j] != -1) {
						if (maxRow < grid[i][j]) {
							maxRow = grid[i][j];
							maxIndex = j;
						}
					}
				}
				grid[i][maxIndex] = -1;
				max = Math.max(max, maxRow);
			}
			ans += max;
			iter++;
		}
		return ans;
	}
}

public class Delete_Greatest_Value_in_Each_Row_2500 {

	public static void main(String[] args) {
		int[][] mat = { { 10 } };
		System.out.println(new Solution2500().deleteGreatestValue(mat));
	}

}
