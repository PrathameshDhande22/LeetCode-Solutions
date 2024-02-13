package leetcode;

class Solution3024 {
	public String triangleType(int[] nums) {
		int a = nums[0];
		int b = nums[1];
		int c = nums[2];

		if (a + b > c && b + c > a && a + c > b) {
			if (a == b && b == c) {
				return "equilateral";
			} else if (a == b || b == c || c == a) {
				return "isosceles";
			} else {
				return "scalene";
			}
		}
		return "none";
	}
}

public class Type_of_Triangle_3024 {

	public static void main(String[] args) {
		int arr[] = { 3, 3, 3 };
		Solution3024 ns = new Solution3024();
		System.out.println(ns.triangleType(arr));
	}

}
