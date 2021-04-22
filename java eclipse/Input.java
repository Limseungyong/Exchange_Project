package exchangeprogram;

import java.util.Scanner;

public class Input {									//사용자로부터 입력값을 받기 위한 클래스
	Scanner scanner = null;
	Input() {
		scanner = new Scanner(System.in);
	}
	public double inputWon() {							//받은 원화를 입력받는 메소드
		double w;
		System.out.print("받은 원화 입력 : ");
		w = scanner.nextDouble();
		return w;
	}
	public int inputType() {
		int type;
		System.out.print("환전할 종류 선택 (0:종료, 1:USD, 2:EUR, 3:JPY) ? ");	//환전할 화폐 코드번호를 입력받는 메소드
		type = scanner.nextInt();
		return type;
	}
}
