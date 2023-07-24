package leetcode;

public class Reverse_Integer_7 {

	public static void main(String[] args) {
		int x = 120;
		Solution7 ns = new Solution7();
		System.out.println(ns.reverse(x));
	}

}

class Solution7 {
	public int reverse(int x) {
		long sum = 0;
		while (x != 0) {
			int rem = x % 10;
			sum = (sum * 10) + rem;
			x = x / 10;
		}
		if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) sum;
	}
}