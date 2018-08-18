package com.pch.jianzhi;

import java.util.Scanner;

public class Power {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner scb = new Scanner(System.in);
		Scanner sce = new Scanner(System.in);
		System.out.print("请输入base：");
		double base = scb.nextDouble();
		System.out.print("请输入exponent：");
		int exponent = sce.nextInt();
		System.out.println(base + "的" + exponent + "次方为" +power(base, exponent));
	}
	
	public static double power(double base,int exponent) throws Exception {
		double p = 1;
		if(exponent >= 0) {
			while(exponent > 0) {
				p = p * base;
				exponent -- ;
			}
		} else if(base == 0 && exponent < 0) {
			throw new Exception("0的负数次幂无意义");
		} else {
			exponent = - exponent;
			while(exponent > 0) {
				p = p * base;
				exponent -- ;
			}
			p = 1 / p;
		}
		return p;
		
		//TODO:当为负数次方的时候，该怎么计算。。。
	}
}
