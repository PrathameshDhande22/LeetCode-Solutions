package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution412 {
	public List<String> fizzBuzz(int n) {
		List<String> fb = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				fb.add("FizzBuzz");
			} else if (i % 3 == 0) {
				fb.add("Fizz");
			} else if (i % 5 == 0) {
				fb.add("Buzz");
			} else {
				fb.add(Integer.toString(i));
			}
		}
		return fb;
	}
}

public class Fizz_Buzz_412 {

	public static void main(String[] args) {
		Solution412 ns = new Solution412();
		System.out.println(ns.fizzBuzz(15));
	}

}
