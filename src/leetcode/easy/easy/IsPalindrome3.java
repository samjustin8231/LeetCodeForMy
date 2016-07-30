package leetcode.easy.easy;

import leetcode.easy.easy.Sort_list.ListNode;

public class IsPalindrome3 {

	public static void main(String[] args) {
		ListNode head = null;
		System.out.println(isPalindrome3(head));
	}

	// ����ԭ��ת��ʵ��o(1)�ռ临�Ӷ�
	public static boolean isPalindrome3(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		if (fast == null || fast.next == null)// 0���ڵ����1���ڵ�
			return true;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		// ��������ν��з�ת
		ListNode midNode = slow;
		ListNode firNode = slow.next;// ��������ĵ�һ���ڵ�
		ListNode cur = firNode.next;// ����ڵ�ӵ�һ���ڵ����һ����ʼ
		firNode.next = null;// ��һ���ڵ���������һ���ڵ�
		while (cur != null) {
			ListNode nextNode = cur.next;// �����´α����Ľڵ�
			cur.next = midNode.next;
			midNode.next = cur;
			cur = nextNode;
		}

		// ��ת֮���ǰ���ν��бȽ�
		slow = head;
		fast = midNode.next;
		while (fast != null) {
			if (fast.val != slow.val)
				return false;
			slow = slow.next;
			fast = fast.next;
		}
		return true;

	}
}
