package DataStructureHelper;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x){
		val = x;
	}

	public static TreeNode generateTestTree1(){
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(8);
		TreeNode node8 = new TreeNode(9);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;
		node2.right = node6;

		node3.left = node7;
		node3.right = node8;

		return root;
	}

	public static TreeNode generateTestTree2(){
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(8);
		TreeNode node6 = new TreeNode(9);
		TreeNode node7 = new TreeNode(12);
		TreeNode node8 = new TreeNode(15);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;
		node2.right = node6;

		node3.left = node7;
		node3.right = node8;

		return root;
	}

	public static TreeNode generateTestTree3(){
		TreeNode root = new TreeNode(2);
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(5);

		root.left = node1;
		root.right = node2;

		return root;
	}
}
