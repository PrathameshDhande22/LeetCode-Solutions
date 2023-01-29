package leetcode;

import java.util.Arrays;

class Solution2037 {
	public int minMovesToSeat(int[] seats, int[] students) {
		int moves = 0;
		Arrays.sort(seats);
		Arrays.sort(students);
		for (int i = 0; i < seats.length; i++) {
			moves += Math.abs(seats[i] - students[i]);
		}
		return moves;
	}
}

public class Minimum_Number_of_Moves_to_Seat_Everyone_2037 {

	public static void main(String[] args) {
		int[] seats = { 2, 2, 6, 6 };
		int[] students = { 1, 3, 2, 6 };
		Solution2037 ns = new Solution2037();
		System.out.println(ns.minMovesToSeat(seats, students));
	}

}
