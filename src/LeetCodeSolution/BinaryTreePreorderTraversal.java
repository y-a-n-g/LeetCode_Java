package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;
import DataStructureHelper.TreeNode;

public class BinaryTreePreorderTraversal {

	List<Integer> result = new ArrayList<Integer>();

	public List<Integer> preorderTraversal(TreeNode root){
		if(root != null){
			result.add(root.val);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		return result;
	}

	public static void main(String[] args) {
		BinaryTreePreorderTraversal caller = new BinaryTreePreorderTraversal();
		TreeNode root = TreeNode.generateTestTree1();
		List<Integer> result = caller.preorderTraversal(root);
		System.out.println(result);
	}

}
