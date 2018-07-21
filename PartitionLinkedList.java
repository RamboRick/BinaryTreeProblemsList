package class04;

public class PartitionLinkedList {
	public ListNode partition(ListNode head, int val) {
		if(head == null) {
			return head;
		}
		ListNode fakeHeadSmall = new ListNode(0);
		ListNode fakeHeadLarge = new ListNode(0);
		ListNode smallTail = fakeHeadSmall;
		ListNode largeTail = fakeHeadLarge;
		ListNode cur = head;
		
		while(cur !=null) {
			if(cur.value <val) {
				smallTail.next = cur;
				smallTail = cur;
			}else {
				largeTail.next = cur;
				largeTail = cur;
			}
			cur =cur.next;
		}
		
		largeTail.next = null;
		smallTail.next = fakeHeadLarge.next;
		return fakeHeadSmall.next;
	}
}
