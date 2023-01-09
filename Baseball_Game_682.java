package leetcode;

import java.util.ArrayList;

class Solution682 {
	public int calPoints(String[] operations) {
		ArrayList<Integer> score = new ArrayList<>();
		for (int i = 0; i < operations.length; i++) {
			switch (operations[i]) {
			case "C":
				score.remove(score.size() - 1);
				break;
			case "D":
				score.add(score.get(score.size() - 1) * 2);
				break;
			case "+":
				score.add(score.get(score.size() - 1) + score.get(score.size() - 2));
				break;
			default:
				score.add(Integer.valueOf(operations[i]));
			}
		}
		return sum(score);
	}

	public static int sum(ArrayList<Integer> scores) {
		int sum = 0;
		for (int s : scores) {
			sum += s;
		}
		return sum;
	}
}

public class Baseball_Game_682 {

	public static void main(String[] args) {
		Solution682 ns = new Solution682();
//		String operations[] = { "5", "2", "C", "D", "+" };
//		String operations[]= {"5","-2","4","C","D","9","+","+"};
		String operations[] = { "1", "C" };
		System.out.println(ns.calPoints(operations));
	}

}
