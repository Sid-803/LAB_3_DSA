package com.greatlearning.app;

import java.util.HashSet;

public class TwoPairs {
	static class Node{	
		Node left;
		Node right;
		int data;
		
		Node(int data){
			this.data = data;
			left= null;
			right = null;
		}
	}
	static boolean traversal(Node node,int sum,HashSet<Integer> iteration) {
		if(node==null) {
			return false;
		}
		if(traversal(node.left,sum,iteration)) {
			return true;
		}
		if(iteration.contains(sum-node.data)) {
			System.out.println("We have found the pair");
			return true;
		}else {
			iteration.add(node.data);
		}
		System.out.println(node.data);
		if(traversal(node.right,sum,iteration)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> iteration = new HashSet<Integer>();
		int sum=60;
		Node root = new Node(40);
		Node left = new Node(20);
		Node right = new Node(60);
		root.left = left;
		root.right = right;
		boolean binarySearch = traversal(root,sum, iteration);
		if(binarySearch == false)
			System.out.println("Pair doesnt exist");
	}
}
