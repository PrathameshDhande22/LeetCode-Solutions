package leetcode;

class Solution2529 {
	public int maximumCount(int[] nums) {
		int neg = 0;
		int pos = 0;
		for (int n : nums) {
			if (n < 0) {
				neg++;
			} else if (n > 0) {
				pos++;
			}
		}
		return Math.max(neg, pos);
	}
}

public class Maximum_Count_of_Positive_Integer_and_Negative_Integer_2529 {

	public static void main(String[] args) {
		Solution2529 ns = new Solution2529();
//		int nums[]= {-2,-1,-1,1,2,3};
//		int nums[]= {-3,-2,-1,0,0,1,2};
		int nums[] = { 5, 20, 66, 1314 };
		System.out.println(ns.maximumCount(nums));
	}

}
