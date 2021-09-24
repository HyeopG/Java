package Study;

import java.util.Scanner;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		if (((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200))
				|| ((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200))) {
			System.out.println("사각형이 겹칩니다.");
		} else {
			System.out.println("사각형이 겹치지 않습니다.");
		}
	}
}
