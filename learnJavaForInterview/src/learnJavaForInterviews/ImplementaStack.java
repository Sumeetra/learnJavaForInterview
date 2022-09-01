package learnJavaForInterviews;

public class ImplementaStack {
	// Stack is the LIFO Last In First Out or FILO First In Last Out Structure
// APIs - push(arg)
//		- pop() - returns item + removes from stack
	// - peek() - reference to top item
	// Ask the interviewer What is the data structure of the elements inside the
	// stack?
	// If they want it to be any arbitrary object, things will be different
	// if they want you to use generics then this needs to be a generics class
	private int array[];
	private int top;
	private int capacity;

	void Stack(int capacity) {
	this.array = new int[capacity];
	this.capacity = capacity;
	this.top = -1; 
	}

	public void push(int item) {
		if (isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		array[++top] = item;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return array[top--];
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return array[top];
	}

	public static void main(String[] args) {

	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}
}
