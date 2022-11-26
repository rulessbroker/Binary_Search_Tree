package com.bridgelabz;

public class BinarySearchTree {

	int size = 0;

	public Node insertData(Node node, int data) {

		if (node == null) {
			node = createNewNode(data);
		}

		if (data < node.data) {
			node.left = insertData(node.left, data);
		} else if (data > node.data) {
			node.right = insertData(node.right, data);
		}
		return node;
	}

	public Node createNewNode(int data) {
		Node node = new Node(data);
		size += 1;
		return node;
	}

	public void printInOrder(Node node) {
		if (node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.data + "->");
		printInOrder(node.right);

	}

	public int size() {
		return size;
	}
}
