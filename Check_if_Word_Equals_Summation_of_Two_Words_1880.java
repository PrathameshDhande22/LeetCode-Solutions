package leetcode;

class Solution1880 {
	public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		if (getInteger(firstWord) + getInteger(secondWord) == getInteger(targetWord)) {
			return true;
		}
		return false;
	}

	public int getInteger(String word) {
		String convert = "";
		for (int i = 0; i < word.length(); i++) {
			convert += word.charAt(i) - 'a';
		}
		return Integer.parseInt(convert);
	}
}

public class Check_if_Word_Equals_Summation_of_Two_Words_1880 {

	public static void main(String[] args) {
		Solution1880 ns = new Solution1880();
		String firstWord = "aaa";
		String secondWord = "a";
		String targetWord = "aaaa";
		System.out.println(ns.isSumEqual(firstWord, secondWord, targetWord));
	}

}
