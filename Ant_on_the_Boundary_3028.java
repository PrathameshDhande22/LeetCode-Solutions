package leetcode;

class Solution3028 {
	public int returnToBoundaryCount(int[] nums) {
		int boundary = 0;
		int diff = 0;
		for (int no : nums) {
			diff += no;
			if (diff == 0) {
				boundary++;
			}
		}

		return boundary;
	}
}

public class Ant_on_the_Boundary_3028 {

	public static void main(String[] args) {
		int nums[] = {2,2,-4,-3,-2,-1};
		Solution3028 ns = new Solution3028();
		System.out.println(ns.returnToBoundaryCount(nums));
	}

}
