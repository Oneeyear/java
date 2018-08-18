package com.pch.jianzhi;

import java.util.Scanner;

/**
 * 问题描述： 
 * 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。
 * 例如把9表示成二进制是1001，有2位是1 因此如果输入9，该函数输出2;
 * Integer.toBinaryString(9); 讲一个数转化为二进制的数
 */
public class NumberOf1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		int n = sc.nextInt();
		System.out.println(numberOf1(n));
	}

	/**
	 * 
	 * @param num 输入值
	 * @param m	余数 
	 * @param n 整数解
	 * @param t 统计1出现的次数
	 * @return t 
	 */
	private static int numberOf1(int num) {
		int m = 0;
		int n = 0;
		int t = 0;
		while(num > 0) {
			m = num % 2 ;
			n = num / 2 ;
			if(m == 1) {
				t++;
			}
			num = n;
		}
		return t;
		
	}
}
