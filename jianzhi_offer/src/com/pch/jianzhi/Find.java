package com.pch.jianzhi;

public class Find {
	/**
	 * 题目描述：
	 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下的顺序排序。 
	 * 完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否包含该整数;
	 */
	public static void main(String[] args) {
		/**
		 * 1 2 9 10
		 * 3 4 11 12
		 * 5 6 13 14
		 * 7 8 15 16
		 */
		int[][] array = new int[4][4];
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 9;
		array[0][3] = 10;
		array[1][0] = 3;
		array[1][1] = 4;
		array[1][2] = 11;
		array[1][3] = 12;
		array[2][0] = 5;
		array[2][1] = 6;
		array[2][2] = 13;
		array[2][3] = 14;
		array[3][0] = 7;
		array[3][1] = 8;
		array[3][2] = 15;
		array[3][3] = 16;
		System.out.println(check(array, 7));
		System.out.println(check(array, 66));
		System.out.println(check(array, 9));
		System.out.println(check(array, 2));
		System.out.println(check(array, 75));
	}

	private static boolean check(int[][] array, int key) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0 ; j < array[i].length; j++) {
				if(array[i][j] == key) {
					return true;
				}
			}
		}
		return false;
	}
}
