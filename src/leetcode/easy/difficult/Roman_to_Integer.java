package leetcode.easy.difficult;

public class Roman_to_Integer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));
	}

	/**
	 * 【罗马数字转整数】
	 * 
	 * @param s
	 * @return
	 */
	public static int romanToInt(String s) {
		if (s.length() < 1)
			return 0;
		int result = 0;
		int sub = getRomanValue(s.charAt(0));
		int lastv = sub;
		for (int i = 1; i < s.length(); ++i) {
			char curc = s.charAt(i);
			int curv = getRomanValue(curc);

			if (curv == lastv)
				sub += curv;
			else if (curv < lastv) {
				result += sub;
				sub = curv;
			} else {
				sub = curv - sub;
			}
			lastv = curv;
		}
		result += sub;
		return result;
	}

	public static int getRomanValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	/**
	 * 【整数转罗马数字】
	 * 
	 * @param num
	 * @return
	 */
	public String intToRoman(int num) {
		String[][] roman = {
				{ "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
				{ "", "M", "MM", "MMM" } };

		String ret = "";
		int digit = 0;
		while (num != 0) {
			int remain = num % 10;
			ret = roman[digit][remain] + ret;
			digit++;
			num /= 10;
		}

		return ret;
	}
}
