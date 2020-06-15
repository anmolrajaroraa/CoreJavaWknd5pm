package oops;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}

public class MyLinkedList {
	
	static Node insert(int data, Node head) {
		if(head == null) {
			Node node = new Node(data);
			head = node;
			return head;
		}
		return null;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many nodes do you want?");
		int N = scanner.nextInt();
		
		Node head = null;
		
		for(int i = 0; i < N; i++) {
			int data = scanner.nextInt();
			head = insert(data, head);
		}
		
		scanner.close();

	}

}
