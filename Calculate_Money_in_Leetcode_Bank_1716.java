package leetcode;

class Solution1716 {
	public int totalMoney(int n) {
		int prev = 1;
		int money = 0;
		int inc = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 7 == 0) {
				money += inc;
				prev++;
				inc = prev;
			} else {
				money += inc;
				inc++;
			}
		}
		return money;
	}
}

public class Calculate_Money_in_Leetcode_Bank_1716 {

	public static void main(String[] args) {
		int n = 20;
		Solution1716 ns = new Solution1716();
		System.out.println(ns.totalMoney(n));
	}

}
