package leetcode;

class Solution1688 {
	public static int numberOfMatches(int n) {
		int team = n, matches = 0;
		while (true) {
			if (team % 2 == 0) {
				matches += team / 2;
				team = team / 2;
			} else {
				matches += (team - 1) / 2;
				team = (team - 1) / 2 + 1;
			}
			if (team == 1) {
				return matches;
			}
		}

	}
}

public class Count_of_Matches_in_Tournament_1688 {

	public static void main(String[] args) {
		System.out.println(Solution1688.numberOfMatches(200));
	}

}
