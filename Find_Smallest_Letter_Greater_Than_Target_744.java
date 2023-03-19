package leetcode;

class Solution744 {
	public char nextGreatestLetter(char[] letters, char target) {
		int min = Integer.MAX_VALUE;
		boolean found = false;
		for (int i = 0; i < letters.length; i++) {
			int dist = letters[i] - target;
			if (dist > 0) {
				found = true;
				min = Math.min(min, dist);
			}
		}
		char returned = found ? (char) ((min + target)) : letters[0];
		return returned;
	}
}

public class Find_Smallest_Letter_Greater_Than_Target_744 {

	public static void main(String[] args) {
//		char[] letters= {'c','f','j'};
		char[] letters = { 'c', 'f', 'j' };
//		char [] letters= {'x','x','y','y'};
		char target = 'c';
		Solution744 ns = new Solution744();
		System.out.println(ns.nextGreatestLetter(letters, target));
	}

}
