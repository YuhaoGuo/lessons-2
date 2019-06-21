package com.zoumf77.interfacedemo;

//名称，修饰符、接口名、继承超类
public interface StandardInterfaceDemo extends InterfaceEmptyDemo{
	
	//String  f="";//取消注释，看看会出现什么
	
	//静态变量
	static int i=0;
	String NAME="zmf"; //都是public 、static、final;

	default String sayHi(){
		return "hi"+NAME;
	}
	
	static void print(){
		System.out.println("hello world");
	}
	
	String whoami();
	
}
