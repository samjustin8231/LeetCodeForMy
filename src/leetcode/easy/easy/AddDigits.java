package leetcode.easy.easy;
public class AddDigits {

	public static void main(String[] args) {
		AddDigits obj = new AddDigits();

		System.out.println(obj.addDigits(38));
	}

	
	public int addDigits(int num) {
		while (num >= 10) {
			num = getSum1(num);
		}
		return num;
	}

	private int getSum1(int num) {
		String str = String.valueOf(num);
		int sum = 0;
		for (char s : str.toCharArray()) {
			sum += s - '0';
		}
		return sum;
	}

}
