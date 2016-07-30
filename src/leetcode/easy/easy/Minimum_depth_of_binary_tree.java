package leetcode.easy.easy;

import leetcode.easy.easy.Invert_Binary_Tree.TreeNode;

public class Minimum_depth_of_binary_tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

	}

	public int run(TreeNode root) {
		if (root == null)
			return 0;
		int minL = run(root.left);
		int minR = run(root.right);

		if (minL == 0 && minR == 0)
			return 1;

		if (minL == 0)
			minL = Integer.MAX_VALUE;
		if (minR == 0)
			minR = Integer.MAX_VALUE;

		if (minL < minR) {
			return minL + 1;
		} else {
			return minR + 1;
		}
	}
}
