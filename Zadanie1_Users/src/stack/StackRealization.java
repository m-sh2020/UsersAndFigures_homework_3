package stack;

import stack.node.UserNode;

public class StackRealization {

	private UserNode head;
	private int size; 

	public int getSize() {
		return size;
	}

	public StackRealization() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void push(String n, int i, String p) {
		UserNode newUser = new UserNode(n, i, p);
		UserNode currentUser = head;
		if (currentUser != null) {
			while (currentUser.getNext() != null) {
				currentUser = currentUser.getNext();
			}
			currentUser.setNext(newUser);
		} else {
			head = newUser;
		}
		size++;
	}

	public void pop() {
		UserNode currentUser = head;
		UserNode prevUser = null;

		if (isEmpty()) {
			System.out.println("Стек пуст");
		} else {
			while (currentUser.getNext() != null) {
				prevUser = currentUser;
				currentUser = prevUser.getNext();
			}
			prevUser.setNext(null);
			size--;
		}
	}

	public double arithmeticMean() {
		double sum = 0;
		UserNode curUser = head;
		while (curUser != null) {
			sum += curUser.getAge();
			curUser = curUser.getNext();
		}
		return (sum / size);
	}

	public String toString() {

		StringBuilder result = new StringBuilder();
		UserNode curUser = head;
		if (curUser != null) {
			while (curUser.getNext() != null) {
				result.append(curUser.toString() + "\n");
				curUser = curUser.getNext();
			}
			result.append(curUser.toString());
		}
		return result.toString();
	}
}
