package com.shiv.Queue;

class Queue {
	int queue[] = new int[5];
	int rear;
	int size;
	int front;

	public void enQueue(int data) {

		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
		} else {
			System.out.println("Queue is full");
		}
	}

	public int deQueue() {

		int data = queue[front];
		if (!isEmpty()) {
			front = (front + 1) % 5;
			size = size - 1;

		}

		else {
			System.out.println("Queue is Empty");
		}
		return data; 
	}

	public void show() {

		for (int i = 0; i < size; i++) {
			System.out.print(queue[front + i] % 5 + " ");
		}
		System.out.println();
		for (int n : queue) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == 5;
	}
}

public class EnqueueDequeue {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);

		q.show();
		q.deQueue();
		q.deQueue();

		q.enQueue(11);
		
		System.out.println(q.isEmpty());
		System.out.println("queue size:" + q.getSize());
		q.show();

	}

}
