package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1389 {
	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			ans.add(index[i], nums[i]);
		}
		int[] answer = new int[ans.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = ans.get(i);
		}
		return answer;
	}
}

public class Create_Target_Array_in_the_Given_Order_1389 {

	public static void main(String[] args) {
		Solution1389 ns = new Solution1389();
		int[] nums = {1,2,3,4,0};
		int[] index = {0,1,2,3,0};
		System.out.println(Arrays.toString(ns.createTargetArray(nums, index)));
	}

}
