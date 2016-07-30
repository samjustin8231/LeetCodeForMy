package leetcode.easy.easy;

public class FindMedianSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = new int[] {};
		int[] B = new int[] { 2, 3 };
		System.out.println(findMedianSortedArrays(A, B));
	}

	public static double findMedianSortedArrays(int A[], int B[]) {
		int lenA = A.length;
		int lenB = B.length;

		int[] C = new int[lenA + lenB];
		int i = 0, j = 0, k = 0;
		if (lenA != 0 && lenB != 0) {
			while (i < lenA || j < lenB) {
				if (i == lenA) {
					C[k++] = B[j++];
					continue;
				}
				if (j == lenB) {
					C[k++] = A[i++];
					continue;
				}

				if (A[i] > B[j]) {
					C[k++] = B[j++];
				} else {
					C[k++] = A[i++];
				}
			}

		} else {
			if (lenA == 0) {
				while (j < lenB) {
					C[k++] = B[j++];
				}
			}
			if (lenB == 0) {
				while (i < lenA) {
					C[k++] = A[i++];
				}
			}
		}

		if ((lenA + lenB) % 2 == 1) {
			return C[(lenA + lenB) / 2];
		}
	
		return (C[(lenA + lenB)/2 - 1] + C[(lenA + lenB)/2]) / 2.0;
	}
}
