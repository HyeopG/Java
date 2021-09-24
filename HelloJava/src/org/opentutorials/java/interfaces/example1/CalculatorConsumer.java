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
	public void setOprands(int left, int right) {	// ���������� ���̿� �޶� ������ �߻�. ( Ŀ�´����̼� �̽� )
		this.left = left;							// �ذ��� - �������̽��� ���.
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
		c.setOprands(10, 20, 30);					// 3���� ����.
		System.out.println(c.sum()+c.avg());
	}

}
