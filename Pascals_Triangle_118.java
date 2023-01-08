package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> genRow = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> innerRow = new ArrayList<>();
			if (i == 0) {
				innerRow.add(1);
			} else {
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						innerRow.add(1);
					}
					else {
						innerRow.add(genRow.get(i-1).get(j-1)+genRow.get(i-1).get(j));
					}
				}
			}
			genRow.add(innerRow);
		}

		return genRow;
	}

}

public class Pascals_Triangle_118 {

	public static void main(String[] args) {
		Solution118 nss = new Solution118();
		System.out.println(nss.generate(5));
	}

}
