package com.shiv.DoublyLinkedlist;

public class Main {

	public static void main(String[] args) {

		Employee dannyGonjappa = new Employee("Danny", "Gonjappa", 121);
		Employee kalamBhai = new Employee("Kalam", "Bhai", 343);
		Employee chandraShekhar = new Employee("Chandra", "Shekhar", 222);
		Employee bhagatSingh = new Employee("Bhagat", "Singh", 922);

		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		list.addToFront(dannyGonjappa);
		list.addToFront(kalamBhai);
		list.addToFront(chandraShekhar);
		list.addToFront(bhagatSingh);

		System.out.println(list.getSize());
		list.printList();

		Employee dineshTiwari = new Employee("Dinesh", "Tiwari", 392);
		list.addToEnd(dineshTiwari);
		list.printList();
		System.out.println();
		System.out.println(list.getSize());
		list.removeFromFront();
		list.printList();
		System.out.println();
		System.out.println(list.getSize());
		list.removeFromEnd();
		list.printList();
		System.out.println();
		System.out.println(list.getSize());
	}
}