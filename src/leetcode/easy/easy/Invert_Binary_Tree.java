package leetcode.easy.easy;

public class Invert_Binary_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		Invert_Binary_Tree obj = new Invert_Binary_Tree();

		System.out.println();
	}

	/**
	 * 递归算法： 1、交换根节点的左右子树。 2、对左右子树分别执行递归反转 。
	 * 
	 * @param root
	 * @return
	 */
	public TreeNode invertTree(TreeNode root) {
		if (null == root) {
			return null;
		}
		TreeNode tempNode = root.left;

		root.left = invertTree(root.right);
		root.right = invertTree(tempNode);

		return root;
	}

}
