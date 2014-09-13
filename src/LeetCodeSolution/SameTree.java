package LeetCodeSolution;

import DataStructureHelper.TreeNode;

//Given two binary trees, write a function to check if they are equal or not.
//Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

public class SameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null && q==null){
			return true;
		}else if((p==null && q!=null) || (p!=null && q==null)){
			return false;
		}else{
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && (p.val==q.val);
		}
	}

	public static void main(String[] args) {
		SameTree caller = new SameTree();
		
		TreeNode root1 = TreeNode.generateTestTree1();
		TreeNode root2 = TreeNode.generateTestTree2();
		
		boolean result = caller.isSameTree(root1, root2);
		System.out.println(result);
	}

}
