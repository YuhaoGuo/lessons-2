package com.zoumf77.interfacedemo;

public interface ExtendedFromStandardInterface extends StandardInterfaceDemo {
	
	/*对缺省方法可以重写，继承的时候
	 * 有三种处理方式,
	 * 1；继承自超类
	 * 2：重新声明 该缺省方法为抽象方法
	 * 3：重写该方法
	 * (non-Javadoc)
	 * @see com.third.interfacedemo.StandardInterfaceDemo#sayHi()
	 */
	
	String sayHi();
	/*
	default String sayHi(){
		return "Extended";
	}
	*/
	
	/*这个静态方法只是隐藏了超类的静态方法
	 * 接口的静态方法是不能被继承的
	 * */
	/*
	static void print(){
		System.out.println("hello world extend");
	}
	*/

}
