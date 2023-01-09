package leetcode;

import java.util.Arrays;

class Solution1051 {
    public int heightChecker(int[] heights) {
    	int expected[]=heights.clone();
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++) {
        	if(heights[i]!=expected[i]) {
        		count++;
        	}
        }
        return count;
    }
}

public class Height_Checker_1051 {

	public static void main(String[] args) {
//		int heights[]= {1,1,4,2,1,3};
//		int heights[]= {5,1,2,3,4};
		int heights[]= {1,2,3,4,5};
		Solution1051 sn=new Solution1051();
		System.out.println(sn.heightChecker(heights));
	}

}
