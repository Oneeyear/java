package com.pch.jianzhi;

import java.util.Scanner;

/**
 * 题目描述：
 * 请实现一个函数，将字符串的每个空格替换为"%20"。
 * 例如输入"We are happy",则输出"We%20are%20happy."。
 */
public class ReplaceBank {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入：");
		String str = s.nextLine(); 
		System.out.println("输出结果为：");
		System.out.println(replace(str));
	}
	
	private static String replace(String str) {
		/**
		 * 创建StringBuilder对象,用于接下来替换空格以及字符串拼接
		 * StringBuilder的使用：https://www.cnblogs.com/jack-Leo/p/6684447.html
		 */
		StringBuilder builder = new StringBuilder();
		if(str == null || str.equals("")) {
			return null;
		} else {
			// 循环判断是否为空格，若是则替换为%20，若不是则用str.charAt(i)拼接
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ' ') {
					builder.append("%20");
				} else {
					builder.append(str.charAt(i));
				}
			}
			return builder.toString();
		}
	}
}
