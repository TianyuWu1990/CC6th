package CC2_1_REMOVE_DUPS;

import CtCILibrary.CtCILibrary.LinkedListNode;

public class Tester {

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

		LinkedListNode cloneA = head.clone();
		LinkedListNode cloneB = head.clone();
		LinkedListNode cloneC = head.clone();
		final long hashStart = System.nanoTime();
		HASH_SET.deleteDups(cloneA);
		final long hashEnd = System.nanoTime();
		final long runnerStart = System.nanoTime();
		CURRENT_RUNNER.deleteDups(cloneB);
		final long runnerEnd = System.nanoTime();



		System.out.println(cloneA.printForward());
		System.out.println(cloneB.printForward());
		System.out.println("HASH_SET executing time: "+(hashEnd - hashStart));
		System.out.println("RUNNER executing time: "+(runnerEnd - runnerStart));

	}

}
