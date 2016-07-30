package leetcode.easy.difficult;

public class Majority_Element {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 1, 2, 3, 2, 3, 2 }));
		
	}

	public static int majorityElement(int[] nums) {
		int candidate = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				candidate = nums[i];
				count = 1;
			} else {
				if (nums[i] == candidate)
					count++;
				else
					count--;
			}
		}
		return candidate;
	}
}
