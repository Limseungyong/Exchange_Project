package exchangeprogram;

public class Output {
		
	public static void printUSD(int usd, int dollar100, int dollar50, int dollar10, 		//�޷��� ȯ���� ���� �� ȭ�� ������ �°� �������� ����ϴ� �޼ҵ�
								int dollar5, int dollar2, int dollar1, int changeUSD) {
		System.out.println("�޷� ȯ�� ���");
		System.out.println("�޷� ���� : " + usd + " �޷�");
		System.out.println("100�޷� - " + dollar100);
		System.out.println("50�޷� - " + dollar50);
		System.out.println("10�޷� - " + dollar10);
		System.out.println("5�޷� - " + dollar5);
		System.out.println("2�޷� - " + dollar2);
		System.out.println("1�޷� - " + dollar1);
		Processing.koreaChange(changeUSD);
	}
	
	public static void printEUR(int euro, int euro100, int euro50, int euro10,				//����ȭ�� ȯ���� ���� �� ȭ�� ������ �°� �������� ����ϴ� �޼ҵ�
								int euro5, int euro2, int euro1, int changeEUR) {
		System.out.println("���� ȯ�� ���");
		System.out.println("���� ���� : " + euro + " ����");
		System.out.println("100���� - " + euro100);
		System.out.println("50���� - " + euro50);
		System.out.println("10���� - " + euro10);
		System.out.println("5���� - " + euro5);
		System.out.println("2���� - " + euro2);
		System.out.println("1���� - " + euro1);
		Processing.koreaChange(changeEUR);
	}
	
	public static void printJPY(int en, int en100, int en50, int en10,						//��ȭ�� ȯ���� ���� �� ȭ�� ������ �°� �������� ����ϴ� �޼ҵ�
								int en5, int en2, int en1, int changeJPY) {
		System.out.println("��ȭ ȯ�� ���");
		System.out.println("��ȭ ���� : " + en + " ��");
		System.out.println("100�� - " + en100);
		System.out.println("50�� - " + en50);
		System.out.println("10�� - " + en10);
		System.out.println("5�� - " + en5);
		System.out.println("2�� - " + en2);
		System.out.println("1�� - " + en1);
		Processing.koreaChange(changeJPY);
	} 
		
	public static void printKchange(int totalchange, int won1000, int won500, 				//ȯ���ϰ� ���� �ܵ��� ȭ�� ������ �°� �������� ����ϴ� �޼ҵ�
									int won100, int won50, int won10) {
		System.out.println("��ȭ �Ž��� : " + totalchange + " ��");
		System.out.println("1000�� - " + won1000 + " ��");
		System.out.println("500�� - " + won500 + " ��");
		System.out.println("100�� - " + won100 + " ��");
		System.out.println("50�� - " + won50 + " ��");
		System.out.println("10�� - " + won10 + " ��");
	}
}
