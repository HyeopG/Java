package Study;

import java.util.Scanner;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("�� �� (x1,y1), (x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		if (((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200))
				|| ((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200))) {
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		} else {
			System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");
		}
	}
}
