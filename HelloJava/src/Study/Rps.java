package Study;

import java.util.Scanner;

public class Rps {

	public static void main(String[] args) {
		String user;
		Scanner sc = new Scanner(System.in);

		System.out.println("컴퓨터가 가위 바위 보 게임을 합니다!");

		while (true) {
			System.out.print("가위 바위 보! >> ");
			user = sc.next();
			int com = (int) (Math.random() * 3);

			if (user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}

			if (user.equals("가위")) {
				if (com == 0)
					System.out.println("비겼습니다.");
				else if (com == 1)
					System.out.println("사용자가 졌습니다.");
				else
					System.out.println("사용자가 이겼습니다.");
			} else if (user.equals("바위")) {
				if (com == 0)
					System.out.println("사용자가 이겼습니다.");
				else if (com == 1)
					System.out.println("비겼습니다.");
				else
					System.out.println("사용자가 졌습니다.");
			} else if (user.equals("보")){
				if (com == 0)
					System.out.println("사용자가 졌습니다.");
				else if (com == 1)
					System.out.println("사용자가 이겼습니다.");
				else
					System.out.println("비겼습니다.");
			}
			else {
				System.out.println("가위, 바위, 보 또는 \"그만\"중 하나를 입력하세요.");
			}
		}
	}
}
