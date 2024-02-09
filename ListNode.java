package leetcode;

public class ListNode {
	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class LL {
	public static void traverse(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
}
