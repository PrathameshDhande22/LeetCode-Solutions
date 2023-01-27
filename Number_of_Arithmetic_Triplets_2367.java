package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution2367 {
	public int arithmeticTriplets(int[] nums, int diff) {
		Set<Integer> no = new HashSet<>();
		int count = 0;
		for (int n : nums)
//			System.out.println(n);
			no.add(n);
		List<Integer> numStore = new ArrayList<>(no);
		Collections.sort(numStore);
		for (int i = 0; i < no.size(); i++) {
			for (int j = i + 1; j < no.size(); j++) {
				for (int k = j + 1; k < no.size(); k++) {
					if (i < j && j < k) {
//						System.out.printf("i=%d,j=%d,k=%d\n", numStore.get(i), numStore.get(j), numStore.get(k));
						if ((numStore.get(j) - numStore.get(i) == diff)
								&& (numStore.get(k) - numStore.get(j) == diff)) {
							count++;
						}
					}
				}
			}
		}
		return count;
	}
}

public class Number_of_Arithmetic_Triplets_2367 {

	public static void main(String[] args) {
		int[] nums = { 6, 14, 15, 26, 31, 36, 38, 41, 42, 45 };
		Solution2367 ns = new Solution2367();
		System.out.println(ns.arithmeticTriplets(nums, 5));
	}

}
