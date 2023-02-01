package leetcode;

class Solution1309 {
	public String freqAlphabets(String s) {
		StringBuffer sb = new StringBuffer();
		char[] alphabets = new char[26];
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = (char) ('a' + i);
		}
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (s.length() > i + 2 && s.charAt(i + 2) == '#') {
				int no = Integer.parseInt(s.substring(i, i + 2));
				sb.append(alphabets[no - 1]);
				i += 2;
			} else {
				int no = Integer.parseInt(String.valueOf(current));
				sb.append(alphabets[no - 1]);
			}
		}
		return sb.toString();
	}
}

public class Decrypt_String_from_Alphabet_to_Integer_Mapping_1309 {

	public static void main(String[] args) {
		String s = "1326#";
		Solution1309 ns = new Solution1309();
		System.out.println(ns.freqAlphabets(s));
	}

}
