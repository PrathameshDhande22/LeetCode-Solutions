package leetcode;

import java.util.Scanner;


/*
 * Class solution is the required class for leetcode solution
 */
class Solution{
	public int[] twoSum(int[] nums,int target) {
		int[] ans=new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					ans[0]=i;
					ans[1]=j;
					return ans;
				}
			}
		}
		return null;
	}
}


public class leetcode_1_two_sum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Elements :");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter "+(i+1)+" Element :");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the Target :");
		int target=sc.nextInt();
		sc.close();
		print(arr, target);
		
	}
	
	public static void print(int[] arr,int target) {
		Solution s=new Solution();
		for(int i=0;i<=1;i++) {
			System.out.print(s.twoSum(arr, target)[i]+" ");
		}
	}
}
