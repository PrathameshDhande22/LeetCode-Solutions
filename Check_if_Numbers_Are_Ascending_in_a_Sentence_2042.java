package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution2042 {
	public boolean areNumbersAscending(String s) {
		int max = 0;
		for (int no : getNumber(s)) {
			if (max < no) {
				max = no;
			} else {
				return false;
			}
		}
		return true;
	}

	public List<Integer> getNumber(String s) {
		List<Integer> nums = new ArrayList<>();
		for (String word : s.split("\s")) {
			try {
				nums.add(Integer.parseInt(word));
			} catch (NumberFormatException b) {
				continue;
			}
		}
		return nums;
	}

}

public class Check_if_Numbers_Are_Ascending_in_a_Sentence_2042 {

	public static void main(String[] args) {
		String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
		Solution2042 ns = new Solution2042();
		System.out.println(ns.areNumbersAscending(s));
		System.out.println(ns.getNumber(s));
	}

}
