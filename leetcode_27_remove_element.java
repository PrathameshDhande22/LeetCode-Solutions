package leetcode;

import java.util.Scanner;
//0,1,2,2,3,0,4,2
class Solution1{
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==val) {
        		for(int j=i;j<nums.length;j++) {
            		nums[j]=nums[j+1];
            	}
        	}
        	else {
        		k+=1;
        	}
        }
        return k;
    }
    
}

public class leetcode_27_remove_element {
	public static void main(String[] args) {
		Solution1 s1=new Solution1();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the No of elements :");
		int no=sc.nextInt();
		int[] arr=new int[10];
		for(int i=0;i<no;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the element to remove : ");
		int val=sc.nextInt();
		System.out.println(s1.removeElement(arr, val));
		sc.close();
//		for(int i:arr) {
//			System.out.println(i);
//		}
	}
	

	
}
