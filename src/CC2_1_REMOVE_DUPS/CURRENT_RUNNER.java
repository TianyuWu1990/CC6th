package CC2_1_REMOVE_DUPS;

import CtCILibrary.CtCILibrary.LinkedListNode;
/*

Ifwe don't have a buffer, we can iterate with two pointers: current which iterates through the linked list,
and runner which checks all subsequent nodes for duplicates.
 */

public class CURRENT_RUNNER {
	public static void deleteDups(LinkedListNode head) {
		LinkedListNode current = head;
		while (current != null) { //outer layer, runner traverse list for each current node
			/* Remove all future nodes that have the same value */
			LinkedListNode runner = current;
			while (runner.next != null) { //inner layer, remove dup nodes for current node
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}	
	
	public static void main(String[] args) {	
		LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		deleteDups(head);
		System.out.println(head.printForward());
	}
}
