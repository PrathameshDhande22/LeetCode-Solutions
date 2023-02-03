package leetcode;

class Solution1725 {
	public int countGoodRectangles(int[][] rectangles) {
		int count = 0, max = 0, min = 0;
		for (int i = 0; i < rectangles.length; i++) {
			min = Math.min(rectangles[i][0], rectangles[i][1]);
			System.out.println("Min = " + min);
			if (max < min) {
				count = 0;
				max = min;
				count++;
			} else if (max == min) {
				count++;
			}
		}
		return count;
	}
}

public class Number_Of_Rectangles_That_Can_Form_The_Largest_Square_1725 {

	public static void main(String[] args) {
		int[][] rectangles = { { 1, 8 }, { 3, 9 }, { 3, 12 }, { 16, 5 } };

		Solution1725 ns = new Solution1725();
		System.out.println(ns.countGoodRectangles(rectangles));
	}

}
