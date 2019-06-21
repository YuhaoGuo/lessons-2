package com.zoumf77.interfacedemo;

import java.io.Serializable;

public class InterfaceDemoImpl3 implements StandardInterfaceDemo,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5487543220917799102L;

	@Override
	public String whoami() {
		// TODO Auto-generated method stub2
		return "I am impl3,I am a subclass of StandardInterfaceDemo";
	}

	public String sayHi(){
		return "Hi "+NAME+"In Impl3 ";
	}
	
	public static void print(){
		System.out.println("static method can be overrided?");
	}
}
