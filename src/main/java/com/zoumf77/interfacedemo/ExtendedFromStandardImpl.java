package com.zoumf77.interfacedemo;

public class ExtendedFromStandardImpl implements ExtendedFromStandardInterface{

	@Override
	public String whoami() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sayHi() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args){
		ExtendedFromStandardInterface impl = new ExtendedFromStandardImpl();

		//ExtendedFromStandardInterface.print();
		StandardInterfaceDemo.print();
		
		
	}
}
