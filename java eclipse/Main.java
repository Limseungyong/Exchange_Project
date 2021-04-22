package exchangeprogram;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	 
	   public static void main(String[] args) throws IOException {
		  
		  FileWrite fw = new FileWrite();				//객체 생성
		  Output output = new Output();
	      Processing pc = new Processing();
	      Input input = new Input();
	      exchangetype extype;
	      
	      fw.headerWrite();								//파일의 헤더라인 쓰기 메소드
	      
	      do {
	    	  extype = new exchangetype();				//변수를 모아둔 exchangetype 클래스를 생성하여 변수 값의 수정을 용이하게 한다.
	    	  extype.w = input.inputWon();				//환전할 원화 입력받기 
	    	  extype.type = input.inputType();			//환전할 화폐 타입 입력받기
	         
	         if (extype.type == Constant.EX_TYPE_QUIT) {			//프로그램 종료
	            break;
	         } else if(extype.type == Constant.EX_TYPE_USD) { 		//달러화 환전
	        	 
	        	extype.exchange_type = "USD";																		//파일에 입력할 환전화폐  
	        	extype.cw = (int)(extype.w / Constant.EX_USD);														//파일에 입력할 환전한 금액
	        	extype.returnwon = ((int)((extype.w / Constant.EX_USD - extype.cw)*Constant.EX_USD/10))*10;	       	//파일에 입력할 원화 잔돈

	        	pc.exchangeUSD(extype.w);  	   						//콘솔창에 출력하는 메소드        
	            
	         } else if(extype.type == Constant.EX_TYPE_EUR) {		//유로화 환전
	        	 
	        	 extype.exchange_type = "EU";																		//파일에 입력할 환전화폐 
	        	 extype.cw = (int)(extype.w / Constant.EX_EUR); 													//파일에 입력할 환전한 금액
	        	 extype.returnwon = ((int)((extype.w / Constant.EX_EUR - extype.cw)*Constant.EX_EUR/10))*10;		//파일에 입력할 원화 잔돈
	        	 
	        	 pc.exchangeEUR(extype.w);							//콘솔창에 출력하는 메소드
		        
	         } else if(extype.type == Constant.EX_TYPE_JPY) {		//엔화 환전
	        	 
	        	 extype.exchange_type = "JPY";																		//파일에 입력할 환전화폐 
	        	 extype.cw = (int)(extype.w / Constant.EX_JPY);														//파일에 입력할 환전한 금액
	        	 extype.returnwon =	((int)((extype.w / Constant.EX_JPY - extype.cw)*Constant.EX_JPY/10))*10;		//파일에 입력할 원화 잔돈
	        	 
	        	 pc.exchangeJPY(extype.w);							//콘솔창에 출력하는 메소드
	        	 
	         } else {
	            System.out.println("잘못 입력하셨습니다.");
	         }   
	         
	         fw.dataWrite(extype);									//환전할 원화 금액, 환전할 화폐 타입, 환전한 금액, 원화 잔돈 데이터를 파일에 저장
	         
	      } while (extype.type != Constant.EX_TYPE_QUIT);
	      fw.fileClose();
	   }
}

