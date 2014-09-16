package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

import DataStructureHelper.TreeNode;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null){
			return result;
		}

		List<TreeNode> queue = new ArrayList<TreeNode>();
		queue.add(root);
		while(queue.size() != 0){
			List<Integer> row = new ArrayList<Integer>();
			List<TreeNode> rowNode = new ArrayList<TreeNode>();
			for(int i=0; i<queue.size();i++){
				rowNode.add(queue.get(i));
				row.add(queue.get(i).val);
			}
			result.add(row);
			queue.clear();
			for(TreeNode node: rowNode){
				if(node.left != null){
					queue.add(node.left);
				}
				if(node.right != null){
					queue.add(node.right);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		BinaryTreeLevelOrderTraversal caller = new BinaryTreeLevelOrderTraversal();
		TreeNode root = TreeNode.generateTestTree2();
		List<List<Integer>> result = caller.levelOrder(root);
		System.out.println(result);
	}

}
