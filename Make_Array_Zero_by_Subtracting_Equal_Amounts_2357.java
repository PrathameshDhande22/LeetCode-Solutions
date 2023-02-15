package leetcode;

class Solution2357 {
	public int minimumOperations(int[] nums) {
		int operations = 0;
		while (true) {
			if (verify(nums))
				return operations;
			else {
				operations++;
				int min = getMin(nums);
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] != 0)
						nums[i] = nums[i] - min;
				}
			}
		}
	}

	public int getMin(int[] nums) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i] && nums[i] != 0) {
				min = nums[i];
			}
		}
		return min;
	}

	public boolean verify(int[] nums) {
		int count = 0;
		for (int n : nums) {
			if (n == 0) {
				count++;
			}
		}
		return count == nums.length;
	}
}

public class Make_Array_Zero_by_Subtracting_Equal_Amounts_2357 {

	public static void main(String[] args) {
		int[] nums = { 0 };
		Solution2357 ns = new Solution2357();
		System.out.println(ns.minimumOperations(nums));
	}

}
