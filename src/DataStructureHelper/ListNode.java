package DataStructureHelper;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x){
		val = x;
		next = null;
	}

	public static ListNode generateList1(){
		ListNode root = new ListNode(7);
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(9);

		root.next = n1;
		n1.next = n2;
		n2.next = n3;

		return root;
	}

	public static ListNode generateList2(){
		ListNode root = new ListNode(4);
		ListNode n1 = new ListNode(9);
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(9);

		root.next = n1;
//		n1.next = n2;
//		n2.next = n3;

		return root;
	}
	
	public static ListNode generateList3(){
		ListNode root = new ListNode(8);
		ListNode n1 = new ListNode(5);
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(7);

		root.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		return root;
	}
	
	public static void printList(ListNode root){
		if(root == null){
			return;
		}
		ListNode p = root;
		while(p!=null){
			System.out.printf("%d -> ", p.val);
			p = p.next;
		}
		System.out.println("NULL");
	}


	public static void main(String[] args) {
		ListNode root1 = generateList1();
		printList(root1);
		
		ListNode root2 = generateList2();
		printList(root2);
	}

}
