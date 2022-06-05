package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface Qu{
	public void enQu(String data);
	public String deQu();
	public void printQu();
}

public class MyQueue extends MyLinkedList implements Qu{
	
	MyListNode front;
	MyListNode rear;
	

	@Override
	public void enQu(String data) {
		MyListNode newNode;
		if(isEmpty()) { //MyLinkedList�� ����������
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear=newNode;
		}
		System.out.println(newNode.getData()+ " added");
	}

	@Override
	public String deQu() {
		if(isEmpty()) {
			return null;
		}
		String data = front.getData();
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return data;
	}

	@Override
	public void printQu() {
		printAll();//MyLinkedList�� ����������
	}
	
}
