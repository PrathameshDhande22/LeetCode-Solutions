package leetcode;

import java.util.Arrays;

class Solution1652 {
	public int[] decrypt(int[] code, int k) {
		int[] answer = new int[code.length];
		if (k == 0) {
			return answer;
		} else if (k > 0) {
			for (int i = 0; i < answer.length; i++) {
				answer[i] = sumLeft(code, k, i + 1);
			}
		} else if (k < 0) {
			for (int i = 0; i < answer.length; i++) {
				answer[i] = sumRight(code, k, i);
			}
		}
		return answer;
	}

	public int sumLeft(int arr[], int key, int index) {
		int sum = 0;
		int keeptrack = 0;
		int len = arr.length;
		while (keeptrack < key) {
			if (index == len) {
				index = 0;
			}
			sum += arr[index];
			index++;
			keeptrack++;
		}
		return sum;
	}

	public int sumRight(int arr[], int key, int index) {
		int sum = 0;
		key = Math.abs(key);
		int keeptrack = 0;
		while (keeptrack < key) {
			index = index == 0 ? arr.length - 1 : index - 1;
			sum += arr[index];
			keeptrack++;
		}
		return sum;
	}
}

public class Defuse_the_Bomb_1652 {

	public static void main(String[] args) {
		Solution1652 ns = new Solution1652();
		int[] code = { 2, 4, 9, 3 };
		System.out.println(Arrays.toString(ns.decrypt(code, -2)));
//		System.out.println(ns.sumLeft(code, 3, 4));
//		System.out.println(ns.sumRight(code, -2, 3));
	}

}
