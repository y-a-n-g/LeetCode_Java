package OtherProblemSolution;

import DataStructureHelper.TreeNode;

public class JudgementSubtree {

	public boolean containSubTree(TreeNode root1, TreeNode root2){
		if(root2 == null){
			return true;
		}else{
			return isSubTree(root1, root2);
		}
	}

	public boolean isSubTree(TreeNode root1, TreeNode root2){
		if(root1 == null){
			return false;
		}
		if((root1.val == root2.val) && isMatch(root1, root2)){
			return true;
		}else{
			return (isSubTree(root1.left, root2) || isSubTree(root1.right, root2));
		}
	}

	public boolean isMatch(TreeNode root1, TreeNode root2){
		if(root2 == null){
			return true;
		}else if( root1 == null){
			return false;
		}else if(root1.val != root2.val){
			return false;
		}else{
			return (isMatch(root1.left, root2.left) && isMatch(root1.right, root2.right));
		}
	}

	public static void main(String[] args) {
		JudgementSubtree caller = new JudgementSubtree();
		TreeNode root1 = TreeNode.generateTestTree1();
		TreeNode root2 = TreeNode.generateTestTree3();
		boolean result = caller.containSubTree(root1, root2);
		System.out.println(result);
	}

}
