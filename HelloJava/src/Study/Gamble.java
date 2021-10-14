package Study;

import java.util.Scanner;

class person{
	String name;
	int n1,n2,n3;
	
	person(String name){
		this.name = name;
	}
	
	void Show() {
		System.out.println("[" + name + "]:<Enter>");
	}
	boolean Enter() {
		n1 = (int)((Math.random()*3)+1);
		n2 = (int)((Math.random()*3)+1);
		n3 = (int)((Math.random()*3)+1);
		
		System.out.println("\t" + n1 + " " + n2 + " " + n3);
		
		if(n1 == n2 && n2 == n3) return true;
		else return false;
	}
}

public class Gamble {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		System.out.printf("겜블링 게임에 참여할 선수 숫자 >>");
		int personNum = scan.nextInt();
		
		person[] person = new person[personNum];
		for(int i=0; i<personNum; i++) {
			System.out.print((i+1) + "번째 선수 이름>>");
			String name = scan.next();
			person[i] = new person(name);
		}
		
		while(true) {
			for(int i=0; i<personNum; i++) {
				person[i].Show();
				boolean end = person[i].Enter();
				
				if(end){
					System.out.println(person[i].name + "님이 승리하셨습니다.");
					System.exit(0);
				}
			}
		} // end while
		
	} 
}
