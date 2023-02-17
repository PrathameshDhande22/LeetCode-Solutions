package leetcode;

class Solution747 {
	public int dominantIndex(int[] nums) {
		int[] val = getMax(nums);
		if (val[0] >= 2 * get2ndLargest(nums, val[0])) {
			return val[1];
		}
		return -1;
	}

	public int[] getMax(int[] nums) {
		int[] maxVal = { -1, 0 };
		for (int i = 0; i < nums.length; i++) {
			if (maxVal[0] < nums[i]) {
				maxVal[0] = nums[i];
				maxVal[1] = i;
			}
		}
		return maxVal;
	}

	public int get2ndLargest(int[] nums, int exlude) {
		int max = -1;
		for (int no : nums) {
			if (max < no && exlude != no) {
				max = no;
			}
		}
		return max;
	}
}

public class Largest_Number_At_Least_Twice_of_Others_747 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		Solution747 ns = new Solution747();
		System.out.println(ns.dominantIndex(nums));
	}

}
