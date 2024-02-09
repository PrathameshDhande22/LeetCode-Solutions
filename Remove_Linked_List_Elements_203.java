package leetcode;

class Solution203 {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		ListNode dump = new ListNode(0);
		dump.next = head;
		ListNode curr = dump;
		while (curr.next != null) {
			if (curr.next.val == val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}

		return dump.next;
	}
}

public class Remove_Linked_List_Elements_203 {

	public static void main(String[] args) {
		// ChatGPT Generated Code.
		ListNode head = new ListNode(1);
		ListNode current = head;

		int[] elements = { 2, 6, 3, 4, 5, 6 };

		// Creating and connecting nodes in a loop
		for (int val : elements) {
			current.next = new ListNode(val);
			current = current.next;
		}

		// traversing
		LL.traverse(head);
		Solution203 ns = new Solution203();
		head = ns.removeElements(head, 6);
		LL.traverse(head);
	}

}
