package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution2951 {
	public List<Integer> findPeaks(int[] mountain) {
		List<Integer> peaks = new ArrayList<Integer>();
		for (int i = 1; i < mountain.length - 1; i++) {
			int curr = mountain[i];
			if (curr > mountain[i - 1] && curr > mountain[i + 1]) {
				peaks.add(i);
			}
		}
		return peaks;
	}
}

public class Find_the_Peaks_2951 {

	public static void main(String[] args) {
		int[] mountain = { 2, 4, 4 };
		Solution2951 ns = new Solution2951();
		System.out.println(ns.findPeaks(mountain));
	}

}
