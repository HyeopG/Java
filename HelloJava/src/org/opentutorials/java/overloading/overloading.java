package org.opentutorials.java.overloading;

public class overloading {

	void A () {System.out.println("void A()");}
	void A (int arg1) {System.out.println("void A (int arg1)");}
	void A (String arg1) {System.out.println("void A (String arg1)");}
	
	public static void main(String[] args) {
		overloading od = new overloading();
		od.A();
		od.A(1); 
		od.A("coding everybody!");
	}
} 