package leetcode;

class Solution1588 {
	public int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int count = 0;
				int subArraySum = 0;
				for (int k = i; k <= j; k++) {
					count++;
					subArraySum += arr[k];
				}
				if (count % 2 == 1) {
					sum += subArraySum;
				}
			}
		}
		return sum;
	}
}

public class Sum_of_All_Odd_Length_Subarrays_1588 {

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12 };
		Solution1588 ns = new Solution1588();
		System.out.println(ns.sumOddLengthSubarrays(arr));
	}

}
