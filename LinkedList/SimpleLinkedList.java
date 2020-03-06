package com.shiv.LinkedList;

class Link {
	private long iData;
	private double dData;
	public Link next;

	public Link(int id, double dd) {
		iData = id;
		dData = dd;
	}

	public long getIData() {
		return iData;
	}

	public double getDData() {
		return dData;
	}

	public void displayLink() {
		System.out.print("{" + iData + "," + dData + "}");
	}

}

class LinkList {

	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertLink(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.print("List (first-->Last):");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

public class SimpleLinkedLIst {

	public static void main(String[] args) {

		LinkList list = new LinkList();
		list.insertLink(1, 23);
		list.insertLink(2, 26);
		list.insertLink(3, 21);
		list.insertLink(4, 29);

		list.displayList();
		while (!list.isEmpty()) {
			Link aLink = list.deleteFirst();
			System.out.print("delete");
			aLink.displayLink();
			System.out.println("");
		}
		list.displayList();
		System.out.print("Nothing we have!!");
	}
}
