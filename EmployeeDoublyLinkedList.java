package com.shiv.DoublyLinkedlist;

public class EmployeeDoublyLinkedList {

	public EmployeeNode head;
	public EmployeeNode tail;
	public int size;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;

		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
		}
		head = node;
		size++;
	}

	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}

	public EmployeeNode removeNode() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removeNode = head;
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return head;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public EmployeeNode removeFromEnd() {
		if (isEmpty()) {
			return null;
		}
		EmployeeNode removeNode = tail;
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		removeNode.setPrevious(null);
		return removeNode();
	}
	

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD->");
		while (current != null) {
			System.out.print(current);
			System.out.print("<=>");
			current = current.getNext();
		}
		System.out.print("null");

	}

}
