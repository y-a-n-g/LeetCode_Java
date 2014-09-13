package LeetCodeSolution;

import DataStructureHelper.TreeNode;

//Given a binary tree, find its maximum depth.
//The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 
public class MaximumDepthOfBinaryTree {
	
	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		int left_max = maxDepth(root.left);
		int right_max = maxDepth(root.right);
		return left_max>right_max?left_max+1:right_max+1;
	}

	public static void main(String[] args) {
		TreeNode root= TreeNode.generateTestTree1();
		MaximumDepthOfBinaryTree caller = new MaximumDepthOfBinaryTree();
		int result = caller.maxDepth(root);
		System.out.println(result);
	}

}
