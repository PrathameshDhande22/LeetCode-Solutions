package leetcode;

class Solution1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        String no = Integer.toString(n);
        for (int i = 0; i < no.length(); i++) {
            sum += Character.getNumericValue(no.charAt(i));
            product *= Character.getNumericValue(no.charAt(i));
        }
        return product-sum;
    }
}

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 {
    public static void main(String[] args) {
        Solution1281 ns = new Solution1281();
        System.out.println(ns.subtractProductAndSum(114));
    }
}
