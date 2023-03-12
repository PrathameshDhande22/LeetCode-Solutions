package leetcode;

class Solution1646 {
	public int getMaximumGenerated(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		int nums[] = new int[n + 1];
		int max = Integer.MIN_VALUE;
		nums[0] = 0;
		nums[1] = 1;
		max = Math.max(nums[0], nums[1]);
		int index = 0;
		int loop = 0;
		while (loop < n) {
			index++;
			loop = index * 2;
			if (loop > n) {

			}
			nums[loop] = nums[index];
			max = Math.max(max, nums[loop]);
			loop = loop + 1;
			if (loop > n) {
				break;
			}
			nums[loop] = nums[index] + nums[index + 1];
			max = Math.max(max, nums[loop]);
		}
		return max;
	}
}

public class Get_Maximum_in_Generated_Array_1646 {

	public static void main(String[] args) {
		int n = 100;
		Solution1646 ns = new Solution1646();
		System.out.println(ns.getMaximumGenerated(n));
	}

}
