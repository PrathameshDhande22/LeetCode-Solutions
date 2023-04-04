package leetcode;

class Solution509 {
	public int fib(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
}

public class Fibonacci_Number_509 {

	public static void main(String[] args) {
		System.out.println(new Solution509().fib(3));

	}

}
