package CC3_2_STACK_MIN;

import java.util.Stack;

public class NODE_CLASS_VALUE_MIN extends Stack<NodeWithMin> {
    public void push(int value) {
        int newMin = Math.min(value, min());
        super.push(new NodeWithMin(value, newMin)); //NodeWithMin is a class contains info about current pushed
                                                    //value and min value so far
    }
    
    public int min() {
    	if (this.isEmpty()) {
    		return Integer.MAX_VALUE;
    	} else {
    		return this.peek().min;
    	}
    }
}
