package org.opentutorials.java.calculator;

class CalculatorDemo{
	int left, right;
	
	public CalculatorDemo() {}
	public CalculatorDemo(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) /2);
	}
}

class substractableCalculator extends CalculatorDemo{

	public substractableCalculator(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	public void sub() {
		System.out.println(this.left - this.right);
	}
	
	public static void main(String[] args) {
		substractableCalculator c1 = new substractableCalculator(20,10);
		System.out.println("extends");
		c1.sum();
		c1.avg();
		c1.sub();
	}
}

public class calculator {
	
	public static void main(String[] args) {
		CalculatorDemo c1 = new CalculatorDemo(10,20);		// 인스턴스 생성자
		c1.sum();
		c1.avg();
		
		substractableCalculator c2 = new substractableCalculator(20, 10);
		System.out.println("------------------------");
		c2.sum();
		c2.sub();
	}
}
