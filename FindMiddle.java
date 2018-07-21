package class04;

public class FindMiddle {
	public ListNode findMi(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next; 
		}
		
		return slow;
	}
}
