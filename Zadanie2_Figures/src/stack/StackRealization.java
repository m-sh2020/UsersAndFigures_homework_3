package stack;

import api.IFigure;

public class StackRealization {
	private Node head;
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

	public void push(IFigure item) {
		Node newNode = new Node();
		newNode.setItem(item);
		Node current = head;
		if (current != null) {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		} else {
			head = newNode;
		}
		size++;
	}

	public void pop() {
		Node current = head;
		Node prev = null;

		if (isEmpty()) {
			System.out.println("Стек пуст");
		} else {

			while (current.getNext() != null) {
				prev = current;
				current = prev.getNext();
			}
			prev.setNext(null);
			size--;
		}
	}

	public String toString() {

		StringBuilder result = new StringBuilder();
		Node current = head;
		if (current != null) {
			while (current.getNext() != null) {
				result.append(current.getItem().toString() + "\n");
				current = current.getNext();
			}
			result.append(current.getItem().toString());
		}
		return result.toString();
	}
}
