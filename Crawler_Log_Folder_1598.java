package leetcode;

class Solution1598 {
	public int minOperations(String[] logs) {
		int count = 0;
		for (String path : logs) {
			if (path.equals("../")) {
				count--;
			} else if (path.equals("./")) {
				continue;
			} else {
				count++;
			}

			if (count < 0) {
				count = 0;
			}
		}
		return count < 0 ? 0 : count;
	}
}

public class Crawler_Log_Folder_1598 {

	public static void main(String[] args) {
		Solution1598 ns = new Solution1598();
		String[] logs = { "./", "wz4/", "../", "mj2/", "../", "../", "ik0/", "il7/" };
		System.out.println(ns.minOperations(logs));
	}

}
