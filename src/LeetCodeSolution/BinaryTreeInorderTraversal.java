package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;
import DataStructureHelper.TreeNode;

public class BinaryTreeInorderTraversal {

	List<Integer> result = new ArrayList<Integer>();

	public List<Integer> inorderTraversal(TreeNode root){
		if(root != null){
			inorderTraversal(root.left);
			result.add(root.val);
			inorderTraversal(root.right);
		}
		return result;
	}

	public static void main(String[] args) {
		BinaryTreeInorderTraversal caller = new BinaryTreeInorderTraversal();
		TreeNode root = TreeNode.generateTestTree1();
		List<Integer> result = caller.inorderTraversal(root);
		System.out.println(result);
	}

}
