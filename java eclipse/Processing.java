package exchangeprogram;

import java.util.Scanner;

public class Processing {
	public static Scanner s = new Scanner(System.in);	
	static double won;										//환전할 원화
	static int type;										//화폐 타입
	static double USDResult;								//원화를 달러 환율로 나눠준 값
	static double EURResult;								//원화를 유로화 환율로 나눠준 값
	static double JPYResult;								//원화를 달러 환율로 나눠준 값
	static int usd;											//지폐 단위로만 환전했을 때의 달러 환전 값
	static int euro;										//지폐 단위로만 환전했을 때의 유로화 환전 값
	static int en;											//지폐 단위로만 환전했을 때의 엔화 환전 값
	static double kchange_USD;								//원화 잔돈의 1원 단위를 없애주기 위해 10으로 나눈 값
	static double kchange_EUR;								//원화 잔돈의 1원 단위를 없애주기 위해 10으로 나눈 값
	static double kchange_JPY;								//원화 잔돈의 1원 단위를 없애주기 위해 10으로 나눈 값
	static int changeUSD; 									//소수점 아래 값들을 없애준 값
	static int changeEUR;									//소수점 아래 값들을 없애준 값
	static int changeJPY;									//소수점 아래 값들을 없애준 값	
	
	public static int exchangeUSD(double won) {				//달러로 환전한 값을 각 화폐 단위에 맞게 수량값을 저장하는 메소드
		USDResult = won / Constant.EX_USD;
		usd = (int)USDResult;
		kchange_USD = (USDResult - usd)*Constant.EX_USD/10;
		changeUSD = (int)kchange_USD;
		
		int dollar100 = usd/100;
		int dollar50 = usd%100/50;
		int dollar10 = usd%100%50/10;
		int dollar5 = usd%100%50%10/5;
		int dollar2 = usd%100%50%10%5/2;
		int dollar1 = usd%100%50%10%5%2/1;	
				
		Output.printUSD(usd, dollar100, dollar50, dollar10, dollar5, dollar2, dollar1, changeUSD); 
		return usd;
	}
	
	public static int exchangeEUR(double won) {				//유로화로 환전한 값을 각 화폐 단위에 맞게 수량값을 저장하는 메소드
		EURResult = won / Constant.EX_EUR;
		euro = (int)EURResult;
		kchange_EUR = (EURResult - euro)*Constant.EX_EUR/10;
		changeEUR = (int)kchange_EUR;
		
		int euro100 = euro/100;
		int euro50 = euro%100/50;
		int euro10 = euro%100%50/10;
		int euro5 = euro%100%50%10/5;
		int euro2 = euro%100%50%10%5/2;
		int euro1 = euro%100%50%10%5%2/1;
		
		Output.printEUR(euro, euro100, euro50, euro10, euro5, euro2, euro1, changeEUR);
		return euro;
	}
	
	public static int exchangeJPY(double won) {				//엔화로 환전한 값을 각 화폐 단위에 맞게 수량값을 저장하는 메소드
		JPYResult = won / Constant.EX_JPY;
		en = (int)JPYResult;
		kchange_JPY = (JPYResult - en)*Constant.EX_JPY/10;
		changeJPY = (int)kchange_JPY;
		
		int en100 = en/100;
		int en50 = en%100/50;
		int en10 = en%100%50/10;
		int en5 = en%100%50%10/5;
		int en2 = en%100%50%10%5/2;
		int en1 = en%100%50%10%5%2/1;
		
		Output.printJPY(en, en100, en50, en10, en5, en2, en1, changeJPY);
		return en;
	}
	
	public static int koreaChange(int change) {				//환전하고 남은 잔돈을 화폐 단위에 맞게 수량값을 저장하는 메소드
		int totalchange = change*10;
		int won1000 = change*10/1000;
		int won500 = change*10%1000/500;
		int won100 = change*10%1000%500/100;
		int won50 = change*10%1000%500%100/50;
		int won10 = change*10%1000%500%100%50/10;
		
		Output.printKchange(totalchange, won1000, won500, won100, won50, won10);
		return totalchange;
	}	
}
