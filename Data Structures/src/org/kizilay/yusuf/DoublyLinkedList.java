package org.kizilay.yusuf;

public class DoublyLinkedList {

	private DNode head;
	private DNode tail;

	public void add(int data) {
		DNode nodeToAdd = new DNode(data);

		if (head == null) {
			head = nodeToAdd;
			tail = nodeToAdd;
		} else {
			DNode current = head;

			while (current.getNext() != null) {
				current = current.getNext();
			}

			current.setNext(nodeToAdd);
			nodeToAdd.setPrev(current);
			tail = nodeToAdd;

		}

	}

	public void show() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			DNode current = head;

			while (current != null) {
				System.out.println(current.getData());

				current = current.getNext();

			}

			System.out.println("-----------------------------------------------------------------------------");
		}
	}

	public void showReverse() {

		if (tail == null) {
			System.out.println("List is empty");
		} else {
			DNode current = tail;

			while (current != null) {
				System.out.println(current.getData());

				current = current.getPrev();

			}

			System.out.println("-----------------------------------------------------------------------------");
		}

	}

}
