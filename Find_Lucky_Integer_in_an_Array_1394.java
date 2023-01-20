package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

class Solution1394 {
	public int findLucky(int[] arr) {
		HashMap<Integer, Integer> storeNums = new HashMap<>();
		Vector<Integer> vc = new Vector<>();
		for (int a : arr) {
			if (storeNums.containsKey(a)) {
				storeNums.put(a, storeNums.get(a) + 1);
			} else {
				storeNums.put(a, 1);
			}
		}
		for (Map.Entry<Integer, Integer> hm : storeNums.entrySet()) {
			if (hm.getKey() == hm.getValue()) {
				vc.add(hm.getKey());
			}
		}
		if (vc.size() != 0) {
			return Collections.max(vc);
		} else {
			return -1;
		}
	}
}

public class Find_Lucky_Integer_in_an_Array_1394 {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 4 };
//		int[] arr= {1,2,2,3,3,3};
//		int[] arr= {2,2,2,3,3};
		Solution1394 ns = new Solution1394();
		System.out.println(ns.findLucky(arr));
	}

}
