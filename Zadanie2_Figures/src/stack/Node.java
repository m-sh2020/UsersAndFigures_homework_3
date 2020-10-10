package stack;

import api.IFigure;

public class Node {

	private IFigure item;
	private Node next;

	public IFigure getItem() {
		return item;
	}

	public void setItem(IFigure item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
