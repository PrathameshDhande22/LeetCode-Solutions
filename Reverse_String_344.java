package leetcode;

class Solution344 {
	public void reverseString(char[] s) {
		for (int i = 0; i < Math.abs(s.length / 2); i++) {
			char temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
	}
}

public class Reverse_String_344 {

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		Solution344 ns = new Solution344();
		ns.reverseString(s);
	}

}
