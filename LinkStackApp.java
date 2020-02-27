package com.shiv.LinkedList;

class Link3 {

	public double dData;
	public Link3 next;

	public Link3(double data) {
		dData = data;
	}

	public double getdData() {
		return dData;
	}

	public void displayLink() {
		System.out.println("{" + dData + "}");
	}
}

class LinkList3 {
	Link3 first;

	public LinkList3() {
		first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertData(double data) {
		Link3 link = new Link3(data);
		link.next = first;
		first = link;
	}

	public double deleteFirst() {
		Link3 temp = first;
		first = first.next;
		return temp.dData;
	}

	public void displayList() {
		Link3 current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

class LinkStack {
	private LinkList3 theList;

	public LinkStack() {
		theList = new LinkList3();
	}

	public void push(long j) {
		theList.insertData(j);
	}

	public double pop() {
		return theList.deleteFirst();
	}

	public boolean isEmpty() {
		return theList.isEmpty();
	}

	public void displayStack() {
		System.out.println("Stack (top-->bottom)");
		theList.displayList();
	}

}

public class LinkStackApp {

	public static void main(String[] args) {
		LinkStack theStack = new LinkStack();
		theStack.push(23);
		theStack.push(89);
		theStack.push(5);
		theStack.push(445);

		theStack.displayStack();

		theStack.push(99);
		theStack.push(65);

		theStack.displayStack();

		theStack.pop();
		theStack.pop();
	
		theStack.displayStack();
	
	}

}
