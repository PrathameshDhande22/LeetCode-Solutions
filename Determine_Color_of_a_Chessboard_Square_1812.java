package leetcode;

class Solution1812 {
	public boolean squareIsWhite(String coordinates) {
		int col = Math.abs((int) ('a' - coordinates.charAt(0))) + 1;
		int row = Character.getNumericValue(coordinates.charAt(1));
		if (col % 2 == 1 && row % 2 == 1 || col % 2 == 0 && row % 2 == 0) {
			return false;
		} else if (col % 2 == 1 && row % 2 == 0) {
			return true;
		} else {
			return true;
		}
	}
}

public class Determine_Color_of_a_Chessboard_Square_1812 {

	public static void main(String[] args) {
		String cord = "c7";
		Solution1812 ns = new Solution1812();
		System.out.println(ns.squareIsWhite(cord));
	}

}
