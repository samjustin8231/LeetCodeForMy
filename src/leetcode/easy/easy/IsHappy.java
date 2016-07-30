package leetcode.easy.easy;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
		if (n <= 0)
			return false;
		int sum = n;
		Set<Integer> set = new HashSet<Integer>();
		while (sum < Integer.MAX_VALUE) {
			if (set.contains(sum))
				return false;
			else
				set.add(sum);
			sum = getPingFangHe(sum);
			if (sum == 1)
				return true;
		}
		return false;
	}

	/**
	 * 19
	 * 
	 * @param n
	 * @return
	 */
	private static int getPingFangHe(int n) {
		int sum = 0;
		while (n != 0) {
			int t = n % 10;
			sum = sum + t * t;
			n = n / 10;
		}
		System.out.println(sum);
		return sum;
	}

	public static boolean isHappy1(int n) {
		if (n <= 0)
			return false;
		long ln = n;
		Set<Long> set = new HashSet<Long>();

		while (ln <= Integer.MAX_VALUE) {
			if (set.contains(ln))
				return false;
			else
				set.add(ln);
			ln = digitSquare(ln);
			if (ln == 1)
				return true;
		}
		return false;
	}

	private static long digitSquare(long ln) {
		long sum = 0;
		while (ln != 0) {
			sum += Math.pow(ln % 10, 2);
			ln /= 10;
		}
		return sum;
	}
}
