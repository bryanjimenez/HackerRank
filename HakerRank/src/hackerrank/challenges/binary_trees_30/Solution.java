package hackerrank.challenges.binary_trees_30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-binary-trees
 * 
 * @author bxj62
 *
 */

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Solution {

	static void levelOrder(Node root) {
		// Write your code here
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue = traverse(queue);
	}

	static Queue<Node> traverse(Queue<Node> queue) {

		if(!queue.isEmpty()){
		
		Node root = queue.remove();

		System.out.print(root.data + " ");

		if (root.left == null && root.right == null) {
			return traverse(queue);
		} else if (root.left != null && root.right != null) {
			queue.add(root.left);
			queue.add(root.right);
			return traverse(queue);
		} else if (root.left != null) {
			queue.add(root.left);
			return traverse(queue);
		} else {
			queue.add(root.right);
			return traverse(queue);
		}
		
		}else{
			return null;
		}

	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		
		sc.close();
	}

}