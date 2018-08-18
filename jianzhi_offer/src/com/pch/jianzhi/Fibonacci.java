package com.pch.jianzhi;

import java.util.Scanner;

/**
 * 斐波那契数列 题目描述：写一个函数，输入n，求斐波那契数列的第n项，斐波那契数列的定义如下： n=0,f(n)=0 ; n=1,f(n)=1;
 * n>1,f(n)=f(n-1)+f(n-2).
 */
public class Fibonacci {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入：");
		int s = sc.nextInt();
		System.out.println("求得斐波那契数列第" + s + "项数为" + fib3(s));
	}

	/**
	 * 递归思想 效率低
	 * @param s
	 * @return
	 */
	private static int fib(int s) {
		int t;
		if (s == 0) {
			t = 0;
		} else if (s == 1) {
			t = 1;
		} else {
			t = fib(s - 1) + fib(s - 2);
		}
		return t;
	}

	/**
	 * 效率高
	 * @param n
	 * @return
	 */
	public static long fib2(int n) {
		long FibOne = 0;
		long FibTwo = 1;
		long FibN = 0;
		int result[] = {0, 1, 2 };
		if (n < 2) {
			return result[n];
		} else {
			for (int i = 2; i <= n; i++) {
				FibN = FibTwo + FibOne;
				FibOne = FibTwo;
				FibTwo = FibN;
			}
		}
		return FibN;
	}
	
	public static long fib3(int m){
		int a = 0;
		int b = 1;
		int c = 0;
		if(m == 0) {
			c = 0;
		} else if(m == 1) {
			c = 1;
		} else {
			for(int i = 2;i <= m; i++) {
				c = a + b;
				a = b;
				b = c;
			}
		}
		return c;
	}
}
