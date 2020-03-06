package com.shiv.LinkedList;

class Link2 {
	public long iData;
	private double dData;
	public Link2 next;

	public Link2(int id, double data) {
		iData = id;
		dData = data;
	}

	public long getIData() {
		return iData;
	}

	public void setIData(long iData) {
		this.iData = iData;
	}

	public double getDData() {
		return dData;
	}

	public void displayLink() {
		System.out.print("{" + iData + "," + dData + "}");
	}

}

class LinkList2 {
	public Link2 first;

	public LinkList2() {
		first = null;
	}

	public void insertLink(int id, double data) {
		Link2 list = new Link2(id, data);
		list.next = first;
		first = list;
	}

	public Link2 find(int key) {
		// Link2 current = first;
		while (first.iData != key) {
			if (first.next == null) {
				return null;
			} else {
				first = first.next;
			}
		}
		return first;
	}

	public Link2 deleteLink(int key) {
		Link2 current = first;
		Link2 previous = first;
		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}
		return current;
	}

	public void displayList() {
		System.out.println("List(first-->last):");
		Link2 current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

public class FindingandDeletingSpecifiedLinks {

	public static void main(String[] args) {

		LinkList2 list = new LinkList2();
		list.insertLink(1, 76);
		list.insertLink(2, 22);
		list.insertLink(3, 99);
		list.insertLink(4, 100);

		list.displayList();
		Link2 f = list.find(3);
		if (f != null) {
			System.out.println("Found link with key " + f.iData);
		} else {
			System.out.println("can't find link");
		}
		Link2 d = list.deleteLink(2);
		if (d != null) {
			System.out.println("Deleted link with key" + d.iData);
		} else {
			System.out.println("can't delete link");
		}

		list.displayList();
	}

}
