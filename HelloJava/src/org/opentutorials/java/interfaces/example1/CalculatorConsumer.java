package org.opentutorials.java.interfaces.example1;

class CalculatorDummy implements Calculatable{
	public void setOprands(int first, int second, int third) {}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}

class Calculator{
	int left, right;
	public void setOprands(int left, int right) {	// 변수갯수가 더미와 달라 문제가 발생. ( 커뮤니케이션 미스 )
		this.left = left;							// 해결방법 - 인터페이스를 사용.
		this.right = right;
	}
	public int sum() {
		return this.left + this.right;
	}
	public int avg() {
		return sum()/2;
	}
}

public class CalculatorConsumer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);					// 3개의 변수.
		System.out.println(c.sum()+c.avg());
	}

}
