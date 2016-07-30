package leetcode.easy.easy;

public class IsPowerOfThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static boolean isPowerOfThree(int n) {
		if (n <= 0)
			return false;
		while (n > 1) {
			if (n % 3 != 0)
				return false;
			n /= 3;
		}
		return true;
	}

	public static boolean isPowerOfThree1(int n) {
		if (n <= 0)
			return false;
		if (n == 1)
			return true;

		return n % 3 == 0 && isPowerOfThree1(n / 3);
	}
}
