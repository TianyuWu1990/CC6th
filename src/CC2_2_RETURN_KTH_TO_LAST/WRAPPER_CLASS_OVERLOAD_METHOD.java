package CC2_2_RETURN_KTH_TO_LAST;

import CtCILibrary.CtCILibrary.*;

public class WRAPPER_CLASS_OVERLOAD_METHOD {
	public static class Index { //wrapper class, create value that can be access in whole class
		public int value = 0;
	}	
	
	public static LinkedListNode kthToLast(LinkedListNode head, int k) {
		Index idx = new Index();
		return kthToLast(head, k, idx);
	}
	
	public static LinkedListNode kthToLast(LinkedListNode head, int k, Index idx) { //overload method
		if (head == null) {
			return null;
		}
		LinkedListNode node = kthToLast(head.next, k, idx);
		idx.value = idx.value + 1; // backwards recursion, idx.value is the nth to last element
		if (idx.value == k) {
			return head;
		} 
		return node;
	}		
	
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6};
		LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
		for (int i = 0; i <= array.length + 1; i++) {
			LinkedListNode node = kthToLast(head, i);
			String nodeValue = node == null ? "null" : "" + node.data;
			System.out.println(i + ": " + nodeValue);
		}
	}
}
