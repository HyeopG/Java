package Study;

import java.util.Scanner;

public class Rps {

	public static void main(String[] args) {
		String user;
		Scanner sc = new Scanner(System.in);

		System.out.println("��ǻ�Ͱ� ���� ���� �� ������ �մϴ�!");

		while (true) {
			System.out.print("���� ���� ��! >> ");
			user = sc.next();
			int com = (int) (Math.random() * 3);

			if (user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}

			if (user.equals("����")) {
				if (com == 0)
					System.out.println("�����ϴ�.");
				else if (com == 1)
					System.out.println("����ڰ� �����ϴ�.");
				else
					System.out.println("����ڰ� �̰���ϴ�.");
			} else if (user.equals("����")) {
				if (com == 0)
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (com == 1)
					System.out.println("�����ϴ�.");
				else
					System.out.println("����ڰ� �����ϴ�.");
			} else if (user.equals("��")){
				if (com == 0)
					System.out.println("����ڰ� �����ϴ�.");
				else if (com == 1)
					System.out.println("����ڰ� �̰���ϴ�.");
				else
					System.out.println("�����ϴ�.");
			}
			else {
				System.out.println("����, ����, �� �Ǵ� \"�׸�\"�� �ϳ��� �Է��ϼ���.");
			}
		}
	}
}
