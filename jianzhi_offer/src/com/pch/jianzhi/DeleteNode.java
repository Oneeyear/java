package com.pch.jianzhi;

/**
 * O(1)时间删除链表结点
 * 问题描述：
 * 给定单向链表的头指针和一个结点指针，
 * 定义一个函数在O(1)时间删除该结点。
 */
public class DeleteNode {
	// 定义结点的结构
	static class ListNode {
	    ListNode nextNode;
	    int nodeValue;
	}
	
    public static void deleteNode(ListNode head, ListNode deListNode) {
        // 空链表
        if (head == null || deListNode == null) {
            return;
        }
        // 要删除的链表中只有一个结点
        if (head == deListNode) {
            head = null;
        } else {
            // 要删除的结点不在链表的中间，不在尾部
            if (deListNode.nextNode != null) {
                deListNode.nodeValue = deListNode.nextNode.nodeValue;
                deListNode.nextNode = deListNode.nextNode.nextNode;
            } else {
                ListNode pointNode = head;
                while (pointNode.nextNode != deListNode) {
                    pointNode = pointNode.nextNode;
                }
                pointNode.nextNode = null;
            }
        }
    }
    
    public static void main(String[] args) {
    	DeleteNode dn = new DeleteNode();
    	ListNode ln1 = new ListNode();
    	ListNode ln2 = new ListNode();
    	ListNode ln3 = new ListNode();
    	ln1.nextNode = ln2;
    	ln2.nextNode = ln3;
    	ln1.nodeValue = 1;
    	ln2.nodeValue = 2;
    	ln3.nodeValue = 3;
    	dn.deleteNode(ln1, ln2);
    	System.out.println(ln1.nextNode.nodeValue);
	}
    
}
