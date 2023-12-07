package leetcode;

class Solution2798 {
	public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		int count = 0;
		for (int i = 0; i < hours.length; i++) {
			if (hours[i] >= target) {
				count++;
			}
		}
		return count;
	}
}

public class Number_of_Employees_Who_Met_the_Target_2798 {

	public static void main(String[] args) {
		int[] hours = { 5, 1, 4, 2, 2 };
		int target = 6;
		Solution2798 ns = new Solution2798();
		System.out.println(ns.numberOfEmployeesWhoMetTarget(hours, target));
	}

}
