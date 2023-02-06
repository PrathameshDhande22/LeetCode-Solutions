package leetcode;

class Solution2169 {
	public int countOperations(int num1, int num2) {
		int count = 0;
		while (true) {
			if (num1 == 0 || num2 == 0) {
				return count;
			}
			if (num1 >= num2) {
				num1 = num1 - num2;
				count++;
			} else {
				num2 = num2 - num1;
				count++;
			}
		}
	}
}

public class Count_Operations_to_Obtain_Zero_2169 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		Solution2169 ns = new Solution2169();
		System.out.println(ns.countOperations(num1, num2));
	}

}
