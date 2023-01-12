package leetcode;

import java.math.BigInteger;

class Solution67 {
	public String addBinary(String a, String b) {
		BigInteger bm = new BigInteger(a,2);
		BigInteger added=bm.add(new BigInteger(b,2));
		return added.toString(2);
	}
}

public class Add_Binary_67 {

	public static void main(String[] args) {
		String a = "1010", b = "1011";
		Solution67 ns = new Solution67();
		System.out.println(ns.addBinary(a, b));
	}

}
