package leetcode;

class Solution2011 {
	public int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for (String s : operations) {
			switch (s) {
			case "++X":
				++x;
				break;
			case "X++":
				x++;
				break;
			case "X--":
				x--;
				break;
			case "--X":
				--x;
				break;
			}
		}
		return x;
	}
}

public class Final_Value_of_Variable_After_Performing_Operations_2011 {

	public static void main(String[] args) {
		Solution2011 ns = new Solution2011();
		String[] operations = { "X++", "++X", "--X", "X--" };
		System.out.println(ns.finalValueAfterOperations(operations));
	}

}
