package leetcode.easy.easy;

public class Maximum_Depth_of_Binary_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		Maximum_Depth_of_Binary_Tree obj = new Maximum_Depth_of_Binary_Tree();

		System.out.println();
	}

	/**
	 * DFS：深度优先排序
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int l = maxDepth(root.left);
		int r = maxDepth(root.right);

		if (l > r) {
			return l + 1;
		} else {
			return r + 1;
		}
	}

}
