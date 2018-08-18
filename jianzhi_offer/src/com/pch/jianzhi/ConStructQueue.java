package com.pch.jianzhi;

import java.util.Stack;

/**
 * 用两个栈实现队列 题目描述： 用两个栈实现一个队列。队列的声明如下，
 * 请实现它的两个函数appendTail和deleteHead,分别完成在队列尾部插入结点和在队列头部删除结点的功能
 * 
 * @author Administrator
 *
 */
public class ConStructQueue {

	Stack<String> stack1 = new Stack<String>(); // 1 2 3 4 5 6 7 8 9
	Stack<String> stack2 = new Stack<String>();

	// 实现appendTail函数
	private void appendTail(String s) {
		stack1.push(s);
	}

	// 实现appendTail函数
	private String deleteHead() throws Exception {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if (stack2.isEmpty()) {
			throw new Exception("队列为空，不能进行删除操作");
		}
		return stack2.pop();
	}

	public static void main(String[] args) throws Exception {
		ConStructQueue cst = new ConStructQueue();
		for(int i = 0; i <= 66; i++) {
			cst.appendTail(i + "");
		}
		System.out.println(cst.deleteHead());
		System.out.println(cst.deleteHead());
		System.out.println(cst.deleteHead());
		System.out.println(cst.deleteHead());
	}
}
