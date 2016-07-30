package leetcode.easy.easy;

import java.util.Arrays;

import leetcode.easy.easy.Delete_Node_in_a_Linked_List.ListNode;

public class Sort_list {
	/**
	 * �鲢���� ���:�����������������ϣ������ϲ���һ���µ������
	 * ���Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ������������ ʱ�临�Ӷ�ΪO(nlogn) �ȶ�����ʽ
	 * 
	 * @param nums
	 *            ����������
	 * @return �����������
	 */
	public static int[] sort(int[] nums, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			// ���
			sort(nums, low, mid);
			// �ұ�
			sort(nums, mid + 1, high);
			// ���ҹ鲢
			merge(nums, low, mid, high);
		}
		return nums;
	}

	public static void merge(int[] nums, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// ��ָ��
		int j = mid + 1;// ��ָ��
		int k = 0;

		// �ѽ�С�������Ƶ���������
		while (i <= mid && j <= high) {
			if (nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}

		// �����ʣ�������������
		while (i <= mid) {
			temp[k++] = nums[i++];
		}

		// ���ұ߱�ʣ�������������
		while (j <= high) {
			temp[k++] = nums[j++];
		}

		// ���������е�������nums����
		for (int k2 = 0; k2 < temp.length; k2++) {
			nums[k2 + low] = temp[k2];
		}
	}

	// �鲢�����ʵ��
	public static void main(String[] args) {

		int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };

		Sort_list.sort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode middleNode = getMiddleOfList(head);
		ListNode middleNextNode = middleNode.next;

		return mergeList(head, middleNextNode);
	}

	private ListNode mergeList(ListNode head, ListNode middleNextNode) {
		ListNode curr = new ListNode(-1);

		while (head != null && middleNextNode != null) {
			if (head.val < middleNextNode.val) {
				curr.next = head;
				head = head.next;
			} else {
				curr.next = middleNextNode;
				middleNextNode = middleNextNode.next;
			}
			curr = curr.next;
		}

		if (head == null) {
			curr.next = middleNextNode;
		} else {
			curr.next = head;
		}

		return curr;
	}

	private ListNode getMiddleOfList(ListNode head) {
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
