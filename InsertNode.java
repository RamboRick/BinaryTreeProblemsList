package class04;

public class InsertNode {
	public ListNode insert(int value, ListNode head) {
		ListNode newNode  = new ListNode(value);
		if(head == null) {
			return newNode;
		}
		if(head.value >= value) {
			newNode.next = head;
			return newNode;
		}
		ListNode cur = head;
		while(cur.next != null && cur.next.value < value) {
			cur = cur.next; 
		}
		newNode.next = cur.next;
		cur.next = newNode;
		return head; 
	}
}
