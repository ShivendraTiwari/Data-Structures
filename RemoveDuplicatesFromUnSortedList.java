package com.shiv.LinkedList;

import java.util.HashMap;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}

}

class RemoveDuplicates {

	private Node head;

	public Node removeDup(Node head) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		if (head == null) {
			return null;
		}
		Node current = head.next;
		Node previous = head;
		Node temp;
		hm.put(head.data, 1);
		while (current != null) {
			int data = current.data;
			if (hm.containsKey(data)) {
				previous.next = current.next;
				temp = current;
				current = current.next;
				temp.next = null;
			} else {
				hm.put(data, 1);
				previous = current;
				current = current.next;
			}

		}
		return head;
	}

	public void display(Node head) {
		Node n = head;
		while (n != null) {
			System.out.println("->" + n.data);
			n = n.next;
		}
	}
}

public class RemoveDuplicatesFromUnSortedList {

	public static void main(String[] args) {

		Node n = new Node(2);
		n.next = new Node(2);
		n.next.next = new Node(2);
		n.next.next.next = new Node(3);
		n.next.next.next.next = new Node(4);
		n.next.next.next.next = new Node(4);
		n.next.next.next.next.next = new Node(2);
		System.out.print("Original List:");
		RemoveDuplicates rm = new RemoveDuplicates();
		rm.display(n);
		System.out.print("\n  Updated List");
		Node x = rm.removeDup(n);
		rm.display(x);

	}
}
