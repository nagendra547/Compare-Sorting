/**
 * 
 */
package com.nagendra547.sort;

/**
 * @author nagendra
 * 
 *         1.Create a Binary Search Tree
 * 
 *         2. Do inOrder Traversal of Binary Search Tree.
 * 
 *         Extra Space O(n) Best case O(n) Avergae Case O(nlogn)
 * 
 *         worst case O(n*n) ( In case of skewerd tree)
 * 
 *         https://www.geeksforgeeks.org/tree-sort/
 *
 */
public class TreeSort extends AbstractSort {
	
	Node root;
	
	@Override
	public void sort(int[] a) {
		// Create a Binary Search Tree
		// Do inOrder Traversal of Binary Search Tree.
		count =0;
		for (int x:a) {
			insert( x);
		}
		inOrder(root, a);

	}
	static int count =0;
	
	private void inOrder(Node node, int []a) {
		if (node == null) {
			return;
		}
		if (node.left != null) {
			inOrder(node.left, a);
		}
		a[count++]=node.data;
		if (node.right != null) {
			inOrder(node.right,a);
		}
		
	}

	private void insert(int x) {
		root= insert(root, x);
	}

	public Node insert( Node node, int data) {
		if (node == null) {
			return new Node(data);
		}
		
		if (node.data <= data) {
			node.right= insert(node.right, data);
		}else {
			node.left = insert(node.left, data);
		}
		return node;
	}
	

}

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}
}
