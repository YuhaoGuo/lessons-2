package com.zoumf77;

public class IfDemo {

	public static void main(String[] args) {
		int aNumber = 3;

		/*
		 * if (aNumber >= 0) 
		 * 		if (aNumber == 0)
		 * 			System.out.println("first string"); 
		 * else
		 * System.out.println("second string");
		 * System.out.println("third string");
		 */

		if (aNumber >= 0)
			if (aNumber == 0)
				System.out.println("first string");
			else
				System.out.println("second string");
		System.out.println("third string");

	}

}
