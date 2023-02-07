package leetcode;

class Solution1450 {
	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int count = 0;
		for (int i = 0; i < startTime.length; i++) {
			if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
				count++;
			}
		}
		return count;
	}
}

public class Number_of_Students_Doing_Homework_at_a_Given_Time_1450 {

	public static void main(String[] args) {
		int[] startTime = { 4 };
		int[] endTime = { 4 };
		int queryTime = 4;
		Solution1450 ns = new Solution1450();
		System.out.println(ns.busyStudent(startTime, endTime, queryTime));

	}

}
