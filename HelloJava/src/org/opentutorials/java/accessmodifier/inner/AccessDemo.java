package org.opentutorials.java.accessmodifier.inner;

class A{
	public String y() {
		return "public void y()";
	}
	private String z() {
		return "private void z()";
	}
	public String x() {
		return z();
	}
}

public class AccessDemo {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y()); // ���� ��

		//System.out.println(a.z()); 
		//private�����̶� ������ �߻���.
		
		System.out.println(a.x()); // ���� ���� ��.
	}
}
