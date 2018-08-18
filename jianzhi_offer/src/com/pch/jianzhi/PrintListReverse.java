package com.pch.jianzhi;

import java.util.Stack;

/**
 * 从尾到头打印链表 
 * 题目描述： 
 * 输入一个链表的头结点，从尾到头反过来打印出每个结点的值.
 */
public class PrintListReverse {
	
	// 首先定义链表结构
	static class LinkNode {
		LinkNode next;
		int node_value;
	}

	/**
	 *  1 2 3 4 5 6 7 8 9
	 *  
	 * @param headNode
	 */
	public void reverse(LinkNode headNode) {
		// 用栈的思想来实现链表的倒序输出  Stack 后进先出
		Stack<LinkNode> stack = new Stack<LinkNode>();
		while (headNode != null) {
			stack.push(headNode);		//1 2 3 8
			headNode = headNode.next;	
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().node_value + " ");	//8 3 2 1
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 输入的链表有多个结点
		PrintListReverse plr = new PrintListReverse();
		LinkNode node1 = new LinkNode();
		LinkNode node2 = new LinkNode();
		LinkNode node3 = new LinkNode();
		LinkNode node4 = new LinkNode();
		node1.node_value = 1;
		node2.node_value = 2;
		node3.node_value = 3;
		node4.node_value = 8;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		plr.reverse(node1);
	}
}
