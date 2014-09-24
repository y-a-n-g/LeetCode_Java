package LeetCodeSolution;

import DataStructureHelper.ListNode;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		if(l1 == null && l2 == null){
			return null;
		}

		int tag = 0;
		int first = 0;
		int second = 0;

		ListNode p1 = l1;
		ListNode p2 = l2;

		ListNode preHead = new ListNode(0);
		ListNode cur = preHead;

		while(!(p1 == null && p2 == null)){
			if(p1 != null){
				first = p1.val;
				p1 = p1.next;
			}

			if(p2 != null){
				second = p2.val;
				p2 = p2.next;
			}
			//generate new
			int val = (first  +second + tag)%10;
			ListNode node = new ListNode(val);
			cur.next = node;
			cur = cur.next;
			tag = (first + second + tag)/10;
			
			//reset
			first = 0;
			second = 0;
		}
		
		if(tag!=0){
			ListNode last = new ListNode(tag);
			cur.next = last;
		}

		return preHead.next;
	}

	public static void main(String[] args) {
		ListNode l1 = ListNode.generateList1();
		ListNode l2 = ListNode.generateList2();
		ListNode.printList(l1);
		ListNode.printList(l2);

		AddTwoNumbers caller = new AddTwoNumbers();
		ListNode result = caller.addTwoNumbers(l1, l2);
		ListNode.printList(result);
	}

}
