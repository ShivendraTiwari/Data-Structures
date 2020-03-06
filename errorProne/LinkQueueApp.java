//It is showing NullPointerException so please resolve it.


package com.shiv.LinkedList;

class Link4 {
	public long dData;
	public Link4 next;

	public Link4(long data) {
		dData = data;
	}

	public void displayLink() {
		System.out.println("{" + dData + "}");
	}
}

class LinkList4 {

	private Link4 first;
	private Link4 last;

	public LinkList4() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertLast(long data) {
		Link4 newLink = new Link4(data);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
			last = newLink;
		}
	}

	public long deleteFirst() {
		long temp = first.dData;
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}

	public void displayList() {
		Link4 current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

class LinkQueue {

	private LinkList4 theList;

	public LinkQueue() {
		theList = new LinkList4();
	}

	public boolean isEmpty() {
		return theList.isEmpty();
	}

	public void insert(long j) {
		theList.insertLast(j);
	}

	public long remove() {
		return theList.deleteFirst();
	}

	public void displayQueue() {
		System.out.println("Queue(fron-->rear)");
		theList.displayList();
	}
}

class LinkQueueApp {
	public static void main(String[] args) {

		LinkQueue theQueue = new LinkQueue();
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);

		theQueue.displayQueue();
		theQueue.insert(50);
		theQueue.insert(60);

		theQueue.displayQueue();

		theQueue.remove();
		theQueue.remove();

		theQueue.displayQueue();

	}

}
