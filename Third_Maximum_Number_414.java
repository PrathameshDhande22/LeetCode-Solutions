package leetcode;

import java.util.*;
class Solution414 {
    public int thirdMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> nu=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!nu.contains(nums[i])){
                nu.add(nums[i]);
            }
            max=Math.max(max,nums[i]);
        }
        if(nu.size()<3){
            return max;
        }
        Collections.sort(nu);
        return nu.get(nu.size()-3);
    }
}
public class Third_Maximum_Number_414 {

	public static void main(String[] args) {
		Solution414 ns=new Solution414();
		int nums[]= {3,2,1};
		System.out.println(ns.thirdMax(nums));
	}

}
