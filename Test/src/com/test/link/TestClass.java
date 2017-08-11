package com.test.link;

public class TestClass {

	Node head; // head of list

	/* Node Class */
	class Node {
		int data;
		Node next;

		// Constructor to create a new node
		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	public int getCount() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		/* Start with the empty list */
		TestClass llist = new TestClass();

		int[] a = { 1, 4, -1, 3, 2 };

		int i = 0;

		while (i < a.length) {

			llist.push(a[i]);
			i = a[i];
			if (i == -1)
				break;
		}

		int out = llist.getCount();
		System.out.println(out);
		llist.printList();
	}

}
