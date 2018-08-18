package com.pch.jianzhi;

/**
 * 问题描述： 输入一个链表，输出该链表中倒数第K个结点。 为了符合大多数人的习惯，从1开始计数，即链表的尾结点是倒数第一个结点。
 * 例如一个链表有6个结点，从头结点开始它们的值依次是1、2、3、4、5、6.这个链表的倒数第三个结点是值为4的结点。
 */

public class FindKthFromTail {
	static class ListNode {
		ListNode nextNode;
		int nodeValue;
	}

	public static void main(String[] args) {
		ListNode ln = new ListNode();
		find(ln, 0);

	}

	/**
	 * 1 2 3 4 5 6 7
	 * @return 
	 */
	private static int find(ListNode head, int k) {
		if (head == null || (0 == k)) {
			return 0;
		}
		ListNode first = head;
		ListNode second = null;
		// 第一个指针先走k-1
		for (int i = 1; i < k; i++) {
			if (first.nextNode != null) {
				first = first.nextNode;
			} else {
				return 0;
			}
		}
		second = head;
		while (first.nextNode != null) {
			first = first.nextNode;
			second = second.nextNode;
		}
		return second.nodeValue;
	}

}
