package leetcode;

import java.util.Arrays;

class Solution1475 {
	public int[] finalPrices(int[] prices) {
		int[] discount = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			discount[i] = getDiscount(prices, i);
		}
		return discount;
	}

	public int getDiscount(int prices[], int i) {
		for (int j = i + 1; j < prices.length; j++) {
			if (prices[i] >= prices[j]) {
				return prices[i] - prices[j];
			}
		}
		return prices[i];
	}
}

public class Final_Prices_With_a_Special_Discount_in_a_Shop_1475 {

	public static void main(String[] args) {
		int[] prices = { 10, 1, 1, 6 };
		Solution1475 ns = new Solution1475();
		System.out.println(Arrays.toString(ns.finalPrices(prices)));
	}

}
