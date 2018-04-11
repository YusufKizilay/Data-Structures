package org.kizilay.yusuf;

public class LinkedList {

	private Node head;

	// Adding a node to end of the list
	public void add(int data) {
		Node nodeToAdd = new Node(data);

		// if list is empty
		if (head == null) {
			head = nodeToAdd;
		} else {
			Node current = head;

			// traverse
			while (current.getNext() != null) {
				current = current.getNext();
			}

			current.setNext(nodeToAdd);

		}

	}

	public void addAt(int index, int data) {
		Node nodeToAdd = new Node(data);

		if (index == 0) {
			addFirst(data);
		} else {
			Node current = head;

			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}

			nodeToAdd.setNext(current.getNext());
			current.setNext(nodeToAdd);

		}

	}

	public void addFirst(int data) {
		Node nodeToAdd = new Node(data);
		// if list is empty
		if (head == null) {
			head = nodeToAdd;
		} else {
			nodeToAdd.setNext(head);
			head = nodeToAdd;
		}

	}

	public void removeFirst() {
		head = head.getNext();
	}

	public void removeLast() {
		Node current = head;
		Node prev = null;

		if (head.getNext() != null) {
			while (current.getNext() != null) {
				prev = current;
				current = current.getNext();
			}

			prev.setNext(null);
			current = null;
		} else {
			head = null;
		}
	}

	public void removeAt(int index) {
		if (index == 0) {
			removeFirst();
		} else {
			Node current = head;

			for (int i = 0; i < index - 1; i++) {
				current = current.getNext();
			}

			Node nodeToRemove = current.getNext();
			current.setNext(nodeToRemove.getNext());
		}
	}

	// iterative solution
	public void reverseWithIteration() {
		Node prev = null;
		Node next;
		Node current = head;

		while (current != null) {
			next = current.getNext();

			current.setNext(prev);

			prev = current;

			current = next;

		}

		head = prev;

	}

	public void reverseWithRecursion() {
		reverse(null, head);
	}

	private void reverse(Node prev, Node current) {
		Node next = null;

		if (current == null) {
			head = prev;
			return;
		}

		next = current.getNext();

		current.setNext(prev);

		prev = current;

		current = next;

		reverse(prev, current);

	}

	public void show() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node node = head;

			while (node.getNext() != null) {
				System.out.println(node.getData());

				node = node.getNext();

			}

			System.out.println(node.getData());
			System.out.println("-----------------------------------------------------------------------------");
		}
	}

	public void showUsingRecursion() {
		traverse(head);
	}

	public void traverse(Node current) {
		if (current == null) {
			System.out.println("-----------------------------------------------------------------------------");
			return;
		}

		System.out.println(current.getData());
		traverse(current.getNext());

	}

}
