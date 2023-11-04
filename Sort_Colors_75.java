package leetcode;

import java.util.Arrays;

class Solution75 {
	public void sortColors(int[] nums) {
		// count the numbers
		int[] count = new int[3];
		for (int n : nums) {
			count[n]++;
		}
		int index = 0;
		int count_index = 0;
		// sort the numbers
		while (index < nums.length) {
			while (count[count_index] > 0) {
				nums[index++] = count_index;
				count[count_index]--;
			}
			count_index++;
		}
	}
}

public class Sort_Colors_75 {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		Solution75 ns = new Solution75();
		ns.sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}

}
