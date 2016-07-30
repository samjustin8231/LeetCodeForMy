package leetcode.easy.easy;

import leetcode.easy.easy.Sort_list.ListNode;

public class LinkedListCycleLists {

	public static void main(String[] args) {

	}

	public boolean hasCycle(ListNode head) {

		if (head == null || head.next == null)
			return false;
		ListNode Faster = head, Slower = head;
		while (Faster.next != null && Faster.next.next != null) {
			Slower = Slower.next;
			Faster = Faster.next.next;

			if (Slower.val == Faster.val) {
				return true;
			}
		}

		return false;
	}
}
