//Below code has got some problem,kindly findout the problem

package com.shiv.LinkedList;

class CreateLink {
	public int dData;
	public CreateLink next;

	public CreateLink(int data) {
		this.dData = data;
	}

	public void displayLink() {
		System.out.println("Data is:" + dData);
	}
}

class FindMiddleElement {
	private CreateLink first;

	public FindMiddleElement() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertLink(int dd) {
		CreateLink newLink = new CreateLink(dd);
		if (isEmpty()) {
			first = newLink;
		}
		first = first.next;
	}

	public void findMiddle() {
		CreateLink rabbit = first;
		CreateLink tortoise = first;
		if(first!=null) {
		while ( rabbit!= null && rabbit.next!=null ) {

			rabbit = rabbit.next.next;
			tortoise = tortoise.next;
		}
	System.out.println(tortoise.dData);
	}}

	public void displayList() {
		CreateLink current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
	}

}

public class FindMiddleElementInSinglePass {

	public static void main(String[] args) {

		FindMiddleElement findMiddleList = new FindMiddleElement();
		findMiddleList.insertLink(20);
		findMiddleList.insertLink(30);
		findMiddleList.insertLink(60);
		findMiddleList.insertLink(40);
		findMiddleList.insertLink(04);

		findMiddleList.displayList();

		findMiddleList.findMiddle();
		
		findMiddleList.displayList();
		
	}

}
