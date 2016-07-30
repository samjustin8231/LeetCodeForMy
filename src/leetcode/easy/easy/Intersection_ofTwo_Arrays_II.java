package leetcode.easy.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_ofTwo_Arrays_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/**
	 * 使用list1.contains()方法， 也可以直接用数组
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			list1.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			if (list1.contains(nums2[i])) {
				list.add(nums2[i]);
				list1.remove(nums2[i]);
			}
		}

		int[] result = new int[list.size()];
		int i = 0;
		for (int t : list) {
			result[i++] = t;
		}

		return result;
	}

	public static int[] intersection1(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
				
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				i++;
			}
		}

		int[] result = new int[list.size()];
		int k = 0;
		for (int t : list) {
			result[k++] = t;
		}
		
		return result;
	}
}
