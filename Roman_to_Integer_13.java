package leetcode;

import java.util.HashMap;

class Solution13 {
	public int romanToInt(String s) {
		HashMap<Character, Integer> num = new HashMap<Character, Integer>();
		num.put('I', 1);
		num.put('V', 5);
		num.put('X', 10);
		num.put('L', 50);
		num.put('C', 100);
		num.put('D', 500);
		num.put('M', 1000);

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char currRoman = s.charAt(i);
			if ((i + 1) < s.length() && num.get(currRoman) < num.get(s.charAt(i + 1))) {
				sum -= num.get(currRoman);
			} else {
				sum += num.get(currRoman);
			}
		}
		return sum;
	}
}

public class Roman_to_Integer_13 {

	public static void main(String[] args) {
		Solution13 ns = new Solution13();
		System.out.println(ns.romanToInt("MCMXCIV"));
	}

}
