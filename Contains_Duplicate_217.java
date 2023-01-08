package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution217 {
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> dupno = new HashMap<>();
		for (int no : nums) {
			if (dupno.containsKey(no)) {
				dupno.replace(no, dupno.get(no) + 1);
			} else
				dupno.put(no, 1);
		}
		List<Integer> maxDup = new ArrayList<>();
		maxDup.addAll(dupno.values());
		int no = Collections.max(maxDup);
System.out.println(maxDup);
		if (dupno.containsValue(no) && no!=1)
			return true;
		else
			return false;

	}
}

public class Contains_Duplicate_217 {

	public static void main(String[] args) {
		Solution217 soln = new Solution217();
//		int nums[]= {1,2,3,1};
		int nums[]= {1,2,3,4};
//		int nums[]= {1,1,1,3,3,4,3,2,4,2};
//		int nums[] = { 7, 10, 5, 5, 6, 6, 4, 10, 5, 4, 9, 4, 9, 6, 5, 9, 6, 3, 6, 5, 6, 7, 7, 4, 9, 9, 10, 5, 8, 1, 8,
//				3, 2, 7, 5, 10, 1, 8, 5, 8, 4, 3, 6, 4, 9, 4, 2, 8, 3, 2, 2, 1, 5, 6, 3, 2, 6, 1, 8, 6, 2, 9, 1, 4, 5,
//				10, 8, 5, 10, 5, 10, 1, 4, 8, 3, 6, 4, 10, 9, 1, 1, 1, 2, 2, 9, 6, 6, 8, 1, 9, 2, 5, 5, 2, 1, 8, 5, 2,
//				3, 10 };

		System.out.println(soln.containsDuplicate(nums));
	}

}
