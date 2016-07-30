package leetcode.easy.easy;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] { 1, 1, 2 }));
	}

	/**
	 * 该方法效率高，推荐使用
	 * @param nums
	 * @return
	 */
	public static boolean containsDuplicate1(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (!set.add(i)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 超时，不可用
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean containsDuplicate(int[] nums) {
		boolean flag = false;

		if (nums.length == 0 || nums.length == 1) {
			return false;
		}

		for (int i = 0; i < nums.length; i++) {
			int t = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (t == nums[j]) {
					flag = true;
					break;
				}
			}

			if (flag)
				break;
		}

		return flag;
	}

}
