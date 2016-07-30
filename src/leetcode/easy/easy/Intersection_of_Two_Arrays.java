package leetcode.easy.easy;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		// testname();
		Intersection_of_Two_Arrays obj = new Intersection_of_Two_Arrays();

		int[] result = obj.intersection(new int[] { 1, 2, 2, 1 }, new int[] {
				2, 2 });
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}


	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> nums1Set = new HashSet<Integer>();
		Set<Integer> resultSet = new HashSet<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			nums1Set.add(nums1[i]);
		}

		for (int j = 0; j < nums2.length; j++) {
			if (nums1Set.contains(nums2[j])) {
				resultSet.add(nums2[j]);
			}
		}

		int result[] = new int[resultSet.size()];
		int index = 0;
		for (int t : resultSet) {
			result[index++] = t;
		}

		return result;
	}
}
