package com.linkedlist;

import java.util.Scanner;

public class LinkedListTest {
	public INode head;
	public INode tail;

	public LinkedListTest() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void appendNodes(INode myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode tempNode = this.head;
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public INode deQueue() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLastNode() {
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		head.getNext().setNext(null);
		return tempNode;
	}

	public void deleteInbetween(INode getNode, INode setNode) {
		INode temp = this.head;
		getNode.setNext(setNode);
	}

	public void size() {
		int i = 0;
		final int ONE = 1;
		INode temp = this.head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			i++;
		}
		System.out.println("the total nodes are " + (i + ONE));
	}

	public INode findNode() {
		System.out.println("enter the key to search node");
		Scanner sc = new Scanner(System.in);
		int searchValue = sc.nextInt();
		INode tempNode = head;
		while (!tempNode.getKey().equals(30)) {
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}
}