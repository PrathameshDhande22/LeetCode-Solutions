package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution1773 {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		int index;
		switch (ruleKey) {
		case "type":
			index = 0;
			break;
		case "color":
			index = 1;
			break;
		default:
			index = 2;
		}
		for (List<String> ls : items) {
			if (ls.get(index).equals(ruleValue)) {
				count++;
			}
		}
		return count;
	}
}

public class Count_Items_Matching_a_Rule_1773 {

	public static void main(String[] args) {
		Solution1773 ns = new Solution1773();
		List<List<String>> ls = new ArrayList<>();
		ls.add(new ArrayList<>());
		ls.add(new ArrayList<>());
		ls.add(new ArrayList<>());
		ls.get(0).add("phone");
		ls.get(0).add("blue");
		ls.get(0).add("pixel");
		ls.get(1).add("computer");
		ls.get(1).add("silver");
		ls.get(1).add("lenovo");
		ls.get(2).add("phone");
		ls.get(2).add("gold");
		ls.get(2).add("iphone");
//		System.out.println(ls);
		int no = ns.countMatches(ls, "color", "silver");
		System.out.println(no);
	}

}
