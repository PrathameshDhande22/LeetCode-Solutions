package leetcode;

class Solution2413 {
	public int smallestEvenMultiple(int n) {
		int i = 1;
		while (true) {
			if (i % 2 == 0 && i % n == 0) {
				return i;
			}
			i++;
		}
	}
}

public class Smallest_Even_Multiple_2413 {

	public static void main(String[] args) {
		Solution2413 ns = new Solution2413();
		System.out.println(ns.smallestEvenMultiple(6));
	}

}
