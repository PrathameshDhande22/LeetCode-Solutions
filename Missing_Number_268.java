package leetcode;

import java.util.Arrays;

class Solution268 {
	public int missingNumber(int[] nums) {
		int count = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == count) {
				count++;
			} else {
				return count;
			}
		}
		return count;
	}
}

public class Missing_Number_268 {

	public static void main(String[] args) {
//		int nums[]= {3,0,1};
//		int nums[]= {0,1};
		int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		Solution268 ss = new Solution268();
		System.out.println(ss.missingNumber(nums));

	}

}
