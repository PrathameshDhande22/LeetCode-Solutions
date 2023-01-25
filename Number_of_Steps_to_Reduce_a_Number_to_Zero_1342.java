package leetcode;

class Solution1342 {
	public int numberOfSteps(int num) {
		int steps = 0;
		while (num != 0) {
			if (num % 2 == 0) {
				steps++;
				num = num / 2;
			} else {
				steps++;
				num -= 1;
			}
		}
		return steps;
	}
}

public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {

	public static void main(String[] args) {
		Solution1342 ns = new Solution1342();
		System.out.println(ns.numberOfSteps(123));
	}

}
