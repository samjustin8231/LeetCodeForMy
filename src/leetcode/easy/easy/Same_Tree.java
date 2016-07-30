package leetcode.easy.easy;

import leetcode.easy.easy.Maximum_Depth_of_Binary_Tree.TreeNode;

public class Same_Tree {
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

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		}

		if (p.val == q.val) {
			boolean isLSame = isSameTree(p.left, q.left);
			boolean isRSame = isSameTree(p.right, q.right);
			if (isLSame && isRSame) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

}
