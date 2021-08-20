package org.opentutorials.java.calculator;

public class calculator {
	int left, right;
	
	public calculator() {}
	public calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) /2);
	}
	
	public static void main(String[] args) {
		calculator c1 = new calculator(10,20);		// 인스턴스 생성자
		c1.sum();
		c1.avg();
		
		substractableCalculator c2 = new substractableCalculator(20, 10);
		c2.sub();
	}
}

class substractableCalculator extends calculator{

	public substractableCalculator(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	public void sub() {
		System.out.println(this.left - this.right);
	}
}
