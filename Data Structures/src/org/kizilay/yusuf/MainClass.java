package org.kizilay.yusuf;

public class MainClass {

	public static void main(String[] args) {

		DoublyLinkedList dLinkedList = new DoublyLinkedList();

		dLinkedList.add(5);
		dLinkedList.add(15);
		dLinkedList.add(3);
		dLinkedList.add(7);
		dLinkedList.add(1);

		dLinkedList.show();
		dLinkedList.showReverse();
	}

}
