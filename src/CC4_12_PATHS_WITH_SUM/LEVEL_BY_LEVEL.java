package CC4_12_PATHS_WITH_SUM;
import java.util.HashMap;

import CtCILibrary.CtCILibrary.TreeNode;

public class LEVEL_BY_LEVEL {


	public static void findSum(TreeNode node, int sum, int[] path, int level) {
		if (node == null) {
			return;
		}

        /* Insert current node into path */
		path[level] = node.data;

		int t = 0;
		for (int i = level; i >= 0; i--){
			t += path[i];
			if (t == sum) {
				print(path, i, level);
			}
		}

		findSum(node.left, sum, path, level + 1);
		findSum(node.right, sum, path, level + 1);

        /* Remove current node from path. Not strictly necessary, since we would
         * ignore this value, but it's good practice.
         */
		path[level] = Integer.MIN_VALUE;
	}

	public static int depth(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(depth(node.left), depth(node.right));
		}
	}

	public static void findSum(TreeNode node, int sum) {
		int depth = depth(node);
		int[] path = new int[depth];
		findSum(node, sum, path, 0);
	}

	private static void print(int[] path, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}


	public static void main(String [] args) {
		/*
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);		
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(-8);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(6);	
		root.right.left.left = new TreeNode(0);	
		System.out.println(countPathsWithSum(root, 0));
		*/
		
		/*TreeNode root = new TreeNode(-7);
		root.left = new TreeNode(-7);
		root.left.right = new TreeNode(1);
		root.left.right.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(20);
		root.right.right.left = new TreeNode(0);
		root.right.right.left.left = new TreeNode(-3);
		root.right.right.left.left.right = new TreeNode(2);
		root.right.right.left.left.right.left = new TreeNode(1);
		System.out.println(countPathsWithSum(root, 0));*/
		
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		root.right.left.right = new TreeNode(4);
		root.right.right = new TreeNode(5);
		findSum(root, 9);
	}
		//System.out.println(countPathsWithSum(root, 4));
	}


