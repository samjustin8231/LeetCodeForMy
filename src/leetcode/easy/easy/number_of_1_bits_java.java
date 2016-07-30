package leetcode.easy.easy;

public class number_of_1_bits_java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(hammingWeight1(11));
	}

	/**
	 * n = 0x110100 n-1 = 0x110011 n&(n - 1) = 0x110000 n = 0x110000 n-1 =
	 * 0x101111 n&(n - 1) = 0x100000 n = 0x100000 n-1 = 0x011111 n&(n - 1) = 0x0
	 * 
	 * @param n
	 * @return
	 */
	public static int hammingWeight1(int n) {
		int count = 0;
		while (0 != n) {
			n = n & (n - 1);
			count++;
		}

		return count;
	}

	/**
	 * ³¬Ê±
	 * 
	 * @param n
	 * @return
	 */
	public static int hammingWeight(int n) {
		int res = 0;
		while (n != 0) {
			int left = n & 0x1;
			res += left;
			n = n >> 1;
		}
		return res;
	}
}
