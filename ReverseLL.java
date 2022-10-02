public class ReverseLL {
public static Node reverse(Node head) {
		if(head==null||head.next==null) return head;
		Node newNode = reverse(head.next);
		Node headNext = head.next;
		headNext.next = head;
		head.next = null;
		return newNode; 
	}

}
