package leetcode;

class Solution1323 {
	public int maximum69Number(int num) {
		char no[] = Integer.toString(num).toCharArray();
		for (int i = 0; i < no.length; i++) {
			if (no[i] == '6') {
				no[i] = '9';
				break;
			}
		}
		StringBuffer sb = new StringBuffer();
		for (char a : no) {
			sb.append(a);
		}
		return Integer.valueOf(sb.toString());
	}
}

public class Maximum_69_Number_1323 {

	public static void main(String[] args) {
		Solution1323 ns = new Solution1323();
		System.out.println(ns.maximum69Number(9999));
	}

}
