package leetcode.easy.easy;

public class Excel_Sheet_Column_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(titleToNumber("AA"));
	}
	
	public static int titleToNumber(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int temp = s.charAt(i) - 'A' + 1;
			sum = sum * 26 + temp;
		}

		return sum;
	}
}
