package hackerrank.challenges.even_tree;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/even-tree
 * 
 * @author bxj62
 *
 */
public class Solution {

	class Node implements Comparable<Node> {
		Node parent;
		private int value;
		private boolean visited;
		private int depth;

		List<Node> children;

		public Node(int value) {
			this.value = value;
			children = new ArrayList<Node>();
			this.visited = false;
			this.depth = 0;
		}

		public void addParent(Node parent) {
			this.parent = parent;
		}

		public void addChild(Node child) {
			if (this.isLeaf()) {
				this.setDepth(1);
			}

			this.children.add(child);
			child.addParent(this);
		}

		public boolean isRoot() {
			return this.parent == null;
		}

		public boolean isLeaf() {
			return this.children.isEmpty();
		}

		/**
		 * returns true if the number of children plus the node is even
		 * 
		 * @return
		 */
		public boolean canTrim() {
			return (this.children.size() + 1) % 2 == 0;
		}

		/**
		 * trim and rebalance tree
		 */
		public void trim() {
			this.parent.children.remove(this);

			if (this.parent.isLeaf()) {
				this.parent.setDepthAfterCut(0);
			} else {
				Collections.sort(this.parent.children, Collections.reverseOrder());
				this.parent.setDepthAfterCut(this.parent.children.get(0).depth + 1);
			}
		}

		public void visited() {
			this.visited = true;
		}

		public boolean hasUnvisitedChildren() {
			boolean unvisited = false;

			for (Node n : this.children) {
				if (!n.wasVisited()) {
					unvisited = true;
					break;
				}
			}

			return unvisited;
		}

		public boolean wasVisited() {
			return this.visited;
		}

		public Node find(int value) {
			Node parent = null;

			if (this.value == value) {
				parent = this;
			} else if (!this.children.isEmpty()) {
				for (Node child : this.children) {

					parent = child.find(value);
					if (parent != null) {
						break;
					}
				}
			}

			return parent;
		}

		public int getWeight() {
			int weight = this.children.size();

			for (Node n : this.children) {
				weight += n.getWeight();
			}

			return weight;
		}

		public void setDepth(int i) {
			if (this.depth < i) {
				this.depth = i;
			}
			if (!this.isRoot()) {
				this.parent.setDepth(++i);
			}
		}

		public void setDepthAfterCut(int i) {
			this.depth = i;

			if (!this.isRoot()) {
				this.parent.setDepthAfterCut(++i);
			}

		}

		@Override
		public String toString() {
			// return "Node [value=" + value + ", depth=" + depth + ",
			// children=" + children + "]";
			return "{\"name\": " + value + ", \"depth\": " + depth + " , \"weight\": " + getWeight()
					+ ", \"children\": " + children + "}";
		}

		@Override
		public int compareTo(Node other) {
			// first check depth
			if (this.depth > other.depth) {
				return 1;
			}
			if (this.depth < other.depth) {
				return -1;
			}
			// if same depth then check children size
			if (this.depth == other.depth) {
				int thisWeight = this.getWeight();
				int otherWeight = other.getWeight();

				if (thisWeight > otherWeight) {
					return 1;
				}
				if (thisWeight < otherWeight) {
					return -1;
				}
			}

			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vertex = in.nextInt();
		int edges = in.nextInt();

		in.nextLine();

		Solution s = new Solution();
		Node root = null;

		while (edges-- > 0) {
			int childVal = in.nextInt();
			int parentVal = in.nextInt();

			if (root == null) {
				root = s.new Node(parentVal);
				root.addChild(s.new Node(childVal));
			} else {
				Node parent = root.find(parentVal);
				parent.addChild(s.new Node(childVal));
			}
		}

		// System.out.println(root);

		int trim = 0;
		while (root.hasUnvisitedChildren()) {

			// System.out.println("searchign root");
			Node leaf = findDeepestLeaf(root);

			// System.out.println("got a leaf: " + leaf);

			// go up finding edge to trim
			while (!leaf.canTrim()) {
				leaf.visited();

				if (leaf.parent.isRoot()) {
					break;
				}

				if (leaf.parent.hasUnvisitedChildren()) {
					leaf = findDeepestLeaf(leaf.parent);
				} else {
					leaf = leaf.parent;
				}
			}

			// found a trim point
			if (leaf.canTrim()) {
				leaf.trim();
				trim++;
				// System.out.println(leaf.parent.value + " " + leaf.value);
			}

		}

		System.out.println(trim);

		in.close();

	}

	private static Node findDeepestLeaf(Node leaf) {
		// get a leaf
		while (!leaf.isLeaf() && !leaf.wasVisited() && leaf.hasUnvisitedChildren()) {
			Collections.sort(leaf.children, Collections.reverseOrder());

			// go through children, find first unvisited leaf
			for (Node n : leaf.children) {
				if (!n.wasVisited()) {
					leaf = n;
					break;
				}
			}
		}

		return leaf;
	}
}