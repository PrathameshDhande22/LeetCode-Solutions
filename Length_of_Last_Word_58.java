package leetcode;

class Solution58 {
	public int lengthOfLastWord(String s) {
		String[] splited = s.trim().split("\s");
		return splited[splited.length - 1].length();
	}
}

public class Length_of_Last_Word_58 {

	public static void main(String[] args) {
		Solution58 ns = new Solution58();
		String s = "luffy is still joyboy";
		System.out.println(ns.lengthOfLastWord(s));
	}

}
