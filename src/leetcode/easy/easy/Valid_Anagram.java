package leetcode.easy.easy;

import java.util.Arrays;

public class Valid_Anagram {

	public static void main(String[] args) {
		boolean issame = isAnagram("anagram", "nagaram");
		System.out.println(issame);
	}

	public static boolean isAnagram(String s, String t) {
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();

		Arrays.sort(sArr);// 底层使用了快排，O(nlogn)
		Arrays.sort(tArr);

		return String.valueOf(sArr).equals(String.valueOf(tArr));
	}
}
