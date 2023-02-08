package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution2283 {
	public boolean digitCount(String num) {
		Map<Integer, Integer> frequency = new HashMap<>();
		for (int i = 0; i < num.length(); i++) {
			int key = Character.getNumericValue(num.charAt(i));
			frequency.put(key, frequency.getOrDefault(key, 0) + 1);
		}
		for (int i = 0; i < num.length(); i++) {
			int key = Character.getNumericValue(num.charAt(i));
			if (frequency.containsKey(i)) {
				if (frequency.get(i) != key) {
					return false;
				}
			}
			else {
				if(key>0) {
					return false;
				}
			}
		}
		return true;
	}
}

public class Check_if_Number_Has_Equal_Digit_Count_and_Digit_Value_2283 {

	public static void main(String[] args) {
		Solution2283 ns = new Solution2283();
		System.out.println(ns.digitCount("1"));
	}

}
