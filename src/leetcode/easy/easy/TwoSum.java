package leetcode.easy.easy;

import java.util.HashMap;

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			Integer n = map.get(numbers[i]);
			if (n == null) {
				map.put(numbers[i], i);
			}

			n = map.get(target - numbers[i]);
			if (n != null && n < i) {
				res[0] = n + 1;
				res[1] = i + 1;
				break;
			}
		}

		return res;
	}
}
