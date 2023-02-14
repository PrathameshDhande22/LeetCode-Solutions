package leetcode;

import java.util.Arrays;

class Solution824 {
	public String toGoatLatin(String sentence) {
		String[] senSplited = sentence.split("\s");
		String ans = "";
		for (int i = 0; i < senSplited.length; i++) {
			ans += getLatin(senSplited[i], i) + " ";
		}
		return ans.trim();
	}

	public String getLatin(String word, int pos) {
		StringBuilder sb = new StringBuilder(word);
		char ex = word.charAt(0);
//    	System.out.println(sb);
		if (ex == 'a' || ex == 'e' || ex == 'i' || ex == 'o' || ex == 'u' || ex == 'A' || ex == 'E' || ex == 'I'
				|| ex == 'O' || ex == 'U') {
			sb.append("ma");
		} else {
			sb.replace(0, 1, "");
			sb.append(ex + "ma");
//			sb.append();
		}
		for (int i = 0; i <= pos; i++) {
			sb.append("a");
		}
		return sb.toString();
	}
}

public class Goat_Latin_824 {

	public static void main(String[] args) {
		Solution824 ns = new Solution824();
		String sen = "Each word consists of lowercase and uppercase letters only";
		System.out.println(ns.toGoatLatin(sen));
		System.out.println("ans = " + "");
	}

}
