package DSA_Medium;

import java.util.Stack;

//O1 time complexity for each function
//MinStack obj = new MinStack();
public class Stack155_MinStack {
	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();
	

	public Stack155_MinStack() {
		super();
	}

	public void push(int val) {
		stack.add(val); // 5 7 8 2 5 3 1 0 7
		// store min at each level
		if(minStack.isEmpty()) {
			minStack.add(val);
		}else {
			minStack.add(Math.min(val, minStack.peek()));
		}		
	}

	public void pop() {
		stack.pop();
		minStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {		
		return minStack.peek();
	}
}
