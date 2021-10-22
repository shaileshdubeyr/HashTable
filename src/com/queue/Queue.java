package com.queue;

import com.linkedlist.INode;
import com.linkedlist.LinkedListTest;

public class Queue {
	private final LinkedListTest myLinkedList;
	public Queue() {
		this.myLinkedList = new LinkedListTest();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void enqueu(INode myNode) {
		myLinkedList.appendNodes(myNode);

	}

	public INode dequeu() {
		return myLinkedList.deQueue();

	}
}
