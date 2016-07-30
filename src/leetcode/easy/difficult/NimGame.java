package leetcode.easy.difficult;
public class NimGame {

	public static void main(String[] args) {
		// testname();
		NimGame obj = new NimGame();

		System.out.println(obj.canWinNim(4));
	}

	public boolean canWinNim(int n) {
		if (n % 4 == 0)
			return false;
		else
			return true;
	}

}
