package leetcode.easy.easy;

import java.util.Arrays;

import leetcode.easy.easy.Delete_Node_in_a_Linked_List.ListNode;

public class Sort_list {
	/**
	 * 归并排序 简介:将两个（或两个以上）有序表合并成一个新的有序表
	 * 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列 时间复杂度为O(nlogn) 稳定排序方式
	 * 
	 * @param nums
	 *            待排序数组
	 * @return 输出有序数组
	 */
	public static int[] sort(int[] nums, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			// 左边
			sort(nums, low, mid);
			// 右边
			sort(nums, mid + 1, high);
			// 左右归并
			merge(nums, low, mid, high);
		}
		return nums;
	}

	public static void merge(int[] nums, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// 左指针
		int j = mid + 1;// 右指针
		int k = 0;

		// 把较小的数先移到新数组中
		while (i <= mid && j <= high) {
			if (nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}

		// 把左边剩余的数移入数组
		while (i <= mid) {
			temp[k++] = nums[i++];
		}

		// 把右边边剩余的数移入数组
		while (j <= high) {
			temp[k++] = nums[j++];
		}

		// 把新数组中的数覆盖nums数组
		for (int k2 = 0; k2 < temp.length; k2++) {
			nums[k2 + low] = temp[k2];
		}
	}

	// 归并排序的实现
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
