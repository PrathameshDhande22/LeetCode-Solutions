package leetcode;

class Solution1108 {
	public String defangIPaddr(String address) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				sb.append("[.]");
			} else {
				sb.append(address.charAt(i));
			}
		}
		return sb.toString();
	}
}

public class Defanging_an_IP_Address_1108 {

	public static void main(String[] args) {
		Solution1108 ns = new Solution1108();
		System.out.println(ns.defangIPaddr("255.100.50.0"));
	}

}
