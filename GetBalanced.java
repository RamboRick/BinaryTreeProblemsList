package class04;

public class GetBalanced {
	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		if(Math.abs(leftHeight - rightHeight) >1) {
			return false;
		}
		return isBalanced(root.left) && isBalanced(root.right);
	}
	
	public int getHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		return Math.max(leftHeight, rightHeight) +1;
	}
}
