package leetcode;

import java.util.List;
import java.util.Vector;

class Solution1431 {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new Vector<>();
		int max = 0;
		for (int i : candies) {
			if (max < i) {
				max = i;
			}
		}
		for (int i = 0; i < candies.length; i++) {
			result.add(candies[i] + extraCandies >= max);
		}
		return result;
	}
}

public class Kids_With_the_Greatest_Number_of_Candies_1431 {

	public static void main(String[] args) {
		Solution1431 ns = new Solution1431();
		int candies[] = {12,1,12};
		System.out.println(ns.kidsWithCandies(candies, 10));
	}

}
