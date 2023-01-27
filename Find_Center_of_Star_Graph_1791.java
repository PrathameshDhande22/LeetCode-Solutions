package leetcode;

class Solution1791 {
	public int findCenter(int[][] edges) {
		if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
			return edges[0][0];
		}
		return edges[0][1];
	}
}

public class Find_Center_of_Star_Graph_1791 {

	public static void main(String[] args) {
		int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
		Solution1791 ns = new Solution1791();
		System.out.println(ns.findCenter(edges));
	}

}
