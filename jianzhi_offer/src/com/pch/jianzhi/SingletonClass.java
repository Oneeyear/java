package com.pch.jianzhi;

/**
 * 题目描述：设计一个类，我们只能生成该类的一个实例
 */
public class SingletonClass {
      //volatile:防止指令重排序
      private static volatile SingletonClass instance;
      
      private SingletonClass() {

      }

      public static SingletonClass getInstace() {
    	  if (instance == null) {
    		  synchronized (SingletonClass.class) {
    			  if (instance == null) {
    				  instance = new SingletonClass();
    			  }
    		  }
    	  }
    	  return instance;
      }
 }
