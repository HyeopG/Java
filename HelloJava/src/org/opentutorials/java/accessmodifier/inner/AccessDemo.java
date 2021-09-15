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
		System.out.println(a.y()); // 실행 됌

		//System.out.println(a.z()); 
		//private형식이라 오류가 발생함.
		
		System.out.println(a.x()); // 정상 실행 됌.
	}
}
