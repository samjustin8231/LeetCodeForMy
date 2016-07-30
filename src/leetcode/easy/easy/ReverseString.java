package leetcode.easy.easy;
public class ReverseString {

	public static void main(String[] args) {
		// testname();
		ReverseString obj = new ReverseString();

		System.out.println(obj.reverseString("Hello"));
	}

	public String reverseString(String s) {

		char[] ch = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = ch.length - 1; i >= 0; i--) {
			sb.append(ch[i]);
		}
		return sb.toString();
	}

	public String reverseString2(String s) {
		char[] chars = new char[s.length()];
		int index = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			chars[index++] = s.charAt(i);
		}
		return new String(chars);
	}
}
