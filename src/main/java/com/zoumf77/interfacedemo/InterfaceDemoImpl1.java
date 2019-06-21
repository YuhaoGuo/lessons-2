package com.zoumf77.interfacedemo;

public class InterfaceDemoImpl1 implements StandardInterfaceDemo{

	@Override
	public String whoami() {
		// TODO Auto-generated method stub
		return "I am impl1,I am a subclass of StandardInterfaceDemo";
	}
	
	
	public static void main(String[] agrs){
		StandardInterfaceDemo siDemo;
		
		siDemo=new InterfaceDemoImpl3(); //用接口作为类型，用实现的子类实例赋值，可以做大扩展，可维护，多态
		
		System.out.println("whoami="+siDemo.whoami());
		
		StandardInterfaceDemo.print();
		
		InterfaceDemoImpl3 siDemo3=new InterfaceDemoImpl3();
		siDemo3.print();
	
	}

}
