package exchangeprogram;

import java.util.Scanner;

public class Input {									//����ڷκ��� �Է°��� �ޱ� ���� Ŭ����
	Scanner scanner = null;
	Input() {
		scanner = new Scanner(System.in);
	}
	public double inputWon() {							//���� ��ȭ�� �Է¹޴� �޼ҵ�
		double w;
		System.out.print("���� ��ȭ �Է� : ");
		w = scanner.nextDouble();
		return w;
	}
	public int inputType() {
		int type;
		System.out.print("ȯ���� ���� ���� (0:����, 1:USD, 2:EUR, 3:JPY) ? ");	//ȯ���� ȭ�� �ڵ��ȣ�� �Է¹޴� �޼ҵ�
		type = scanner.nextInt();
		return type;
	}
}
