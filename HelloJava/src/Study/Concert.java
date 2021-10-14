package Study;

import java.util.Scanner;


class Reservation{
	String S[], A[], B[];
	Scanner sc;

	Reservation(){
		S = new String[10];
		A = new String[10];
		B = new String[10];
		sc = new Scanner(System.in);
		for(int i=0; i<S.length; i++) {
			S[i] = "___";
			A[i] = "___";
			B[i] = "___";
		}
	}
	 public void printSeat(String seat[]) {		// �¼� ��ȸ
	      for(int i=0; i<seat.length; i++) {
	         System.out.print(" "+seat[i]+" ");
	      }
	      System.out.println();
	   }
	 
	 public void inputSeat(String seat[]) {		// ����� ����
	      System.out.print("�̸�>>");
	      String name = sc.next();
	      while(true) {
	         System.out.print("��ȣ>>");
	         int num = sc.nextInt();
	         num--;
	         if(seat[num].equals("___")) {
	            seat[num] = name;
	            break;
	         }
	         else {
	            System.out.println("�ٸ� �¼��� ������ �ּ���.");
	         }
	      }
	   }
	 
	 public void deleteSeat(String seat[]) {	// ����� ���
	      System.out.print("�̸�>>");
	      String name = sc.next();
	      for(int i=0; i<seat.length; i++) {
	         if(name.equals(seat[i])) {
	            seat[i] = "___";
	            break;
	         }
	      }
	   }
	
	public void choiceSeat(boolean in_de) { // in_de insert(true)���� delete(false)����
		while(true) {
			System.out.print("�¼����� S(1), A(2), B(3) >> ");
	         int select = sc.nextInt();
	         
	         switch(select) {
	         case 1: 
	            System.out.print("S>>");
	            printSeat(S);
	            if(in_de) {inputSeat(S); }
	            else {deleteSeat(S);}
	            return;
	         case 2:
	            System.out.print("A>>");
	            printSeat(A);
	            if(in_de) { inputSeat(A); }
	            else {deleteSeat(A);}
	            return;
	         case 3: 
	            System.out.print("B>>");
	            printSeat(B);
	            if(in_de) { inputSeat(B); }
	            else {deleteSeat(B);}
	            return;
	         default:
	            System.out.println("�ٽ� �Է��� �ּ���.");
	         }
	      }
	}
}

public class Concert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Reservation R = new Reservation();
		
		while(true) {
			System.out.printf("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			int select = scan.nextInt();
		
			if(!(select > 0 && select < 5)) {
				continue;
			} // end if
			
			switch(select) {
			case 1:
				R.choiceSeat(true);
				break;
			case 2:
				R.printSeat(R.S);
				R.printSeat(R.A);
				R.printSeat(R.B);
				break;
			case 3:
				R.choiceSeat(false);
				break;
			case 4:
				System.exit(0);
			} // end switch
		} // end while
	}
}
