package LeetCodeSolution;

import DataStructureHelper.ListNode;

public class InsertionSortList {
	
    private ListNode searchForInsertPos(ListNode head, int val) {  
        ListNode p  = head;  
        while(p.next!=null && p.next.val<=val) {  
        	p  = p.next;  
        }  
        return p;  
    }  
	
	public ListNode insertionSortList(ListNode head){
		if(head == null||head.next == null){
			return head;
		}
		
		ListNode preHead = new ListNode(Integer.MIN_VALUE);  
        ListNode p = head;  
        while(p!=null) {  
        	ListNode next = p.next;
            ListNode pre  = searchForInsertPos(preHead, p.val);  
            p.next = pre.next;
            pre.next = p;
            p = next;
        }  
        return preHead.next;
	}

	public static void main(String[] args) {
		ListNode head = ListNode.generateList3();
		ListNode.printList(head);
		InsertionSortList caller = new InsertionSortList();
		ListNode newHead = caller.insertionSortList(head);
		ListNode.printList(newHead);
	}

}
