package CC3_2_STACK_MIN;

public class TESTER {
	public static void main(String[] args) {
		NODE_CLASS_VALUE_MIN stack = new NODE_CLASS_VALUE_MIN();
		STACK_STORED_MIN stack2 = new STACK_STORED_MIN();
		int[] array = {2, 1, 3, 1};
		for (int value : array) {
			stack.push(value);
			stack2.push(value);
			System.out.print(value + ", ");
		}
		System.out.println('\n');
		for (int i = 0; i < array.length; i++) {
			System.out.println("Popped " + stack.pop().value + ", " + stack2.pop());
			System.out.println("New min is " + stack.min() + ", " + stack2.min());
		}
	}

}
