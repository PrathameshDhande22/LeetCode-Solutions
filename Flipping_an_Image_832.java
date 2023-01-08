package leetcode;

import java.util.Arrays;

class Solution832 {
    public int[][] flipAndInvertImage(int[][] image) {
    	for(int row[]:image) {
    		for(int i=0;i<row.length/2;i++) {
        		int temp=row[i];
        		row[i]=row[row.length-1-i];
        		row[row.length-1-i]=temp;
        		
        	}
    		for(int i=0;i<row.length;i++) {
    			if(row[i]==1) {
    				row[i]=0;
    			}
    			else {
    				row[i]=1;
    			}
    		}
    	}
    return image;
    }
}

//[[1,0,0],[0,1,0],[1,1,1]]
public class Flipping_an_Image_832 {

	public static void main(String[] args) {
		Solution832 ns=new Solution832();
//		int [][] image={{1,1,0},{1,0,1},{0,0,0}};
		int [][] image= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		
		int[][] flipped=ns.flipAndInvertImage(image);
		for(int [] row:flipped) {
			System.out.println(Arrays.toString(row));
		}
	}

}
