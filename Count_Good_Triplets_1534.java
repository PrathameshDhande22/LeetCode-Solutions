package leetcode;

class Solution1534 {
	public int countGoodTriplets(int[] arr, int a, int b, int c) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if ((Math.abs(arr[i] - arr[j]) <= a) && (Math.abs(arr[j] - arr[k]) <= b)
							&& (Math.abs(arr[i] - arr[k]) <= c)) {
						count++;
					}
//        			System.out.printf("i=%d, j=%d, k=%d\n",arr[i],arr[j],arr[k]);
				}
			}
		}
		return count;
	}
}

public class Count_Good_Triplets_1534 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3 };
		Solution1534 ns = new Solution1534();
		System.out.println(ns.countGoodTriplets(arr, 0, 0, 1));
	}

}
