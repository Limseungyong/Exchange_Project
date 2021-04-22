package exchangeprogram;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	 
	   public static void main(String[] args) throws IOException {
		  
		  FileWrite fw = new FileWrite();				//��ü ����
		  Output output = new Output();
	      Processing pc = new Processing();
	      Input input = new Input();
	      exchangetype extype;
	      
	      fw.headerWrite();								//������ ������� ���� �޼ҵ�
	      
	      do {
	    	  extype = new exchangetype();				//������ ��Ƶ� exchangetype Ŭ������ �����Ͽ� ���� ���� ������ �����ϰ� �Ѵ�.
	    	  extype.w = input.inputWon();				//ȯ���� ��ȭ �Է¹ޱ� 
	    	  extype.type = input.inputType();			//ȯ���� ȭ�� Ÿ�� �Է¹ޱ�
	         
	         if (extype.type == Constant.EX_TYPE_QUIT) {			//���α׷� ����
	            break;
	         } else if(extype.type == Constant.EX_TYPE_USD) { 		//�޷�ȭ ȯ��
	        	 
	        	extype.exchange_type = "USD";																		//���Ͽ� �Է��� ȯ��ȭ��  
	        	extype.cw = (int)(extype.w / Constant.EX_USD);														//���Ͽ� �Է��� ȯ���� �ݾ�
	        	extype.returnwon = ((int)((extype.w / Constant.EX_USD - extype.cw)*Constant.EX_USD/10))*10;	       	//���Ͽ� �Է��� ��ȭ �ܵ�

	        	pc.exchangeUSD(extype.w);  	   						//�ܼ�â�� ����ϴ� �޼ҵ�        
	            
	         } else if(extype.type == Constant.EX_TYPE_EUR) {		//����ȭ ȯ��
	        	 
	        	 extype.exchange_type = "EU";																		//���Ͽ� �Է��� ȯ��ȭ�� 
	        	 extype.cw = (int)(extype.w / Constant.EX_EUR); 													//���Ͽ� �Է��� ȯ���� �ݾ�
	        	 extype.returnwon = ((int)((extype.w / Constant.EX_EUR - extype.cw)*Constant.EX_EUR/10))*10;		//���Ͽ� �Է��� ��ȭ �ܵ�
	        	 
	        	 pc.exchangeEUR(extype.w);							//�ܼ�â�� ����ϴ� �޼ҵ�
		        
	         } else if(extype.type == Constant.EX_TYPE_JPY) {		//��ȭ ȯ��
	        	 
	        	 extype.exchange_type = "JPY";																		//���Ͽ� �Է��� ȯ��ȭ�� 
	        	 extype.cw = (int)(extype.w / Constant.EX_JPY);														//���Ͽ� �Է��� ȯ���� �ݾ�
	        	 extype.returnwon =	((int)((extype.w / Constant.EX_JPY - extype.cw)*Constant.EX_JPY/10))*10;		//���Ͽ� �Է��� ��ȭ �ܵ�
	        	 
	        	 pc.exchangeJPY(extype.w);							//�ܼ�â�� ����ϴ� �޼ҵ�
	        	 
	         } else {
	            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	         }   
	         
	         fw.dataWrite(extype);									//ȯ���� ��ȭ �ݾ�, ȯ���� ȭ�� Ÿ��, ȯ���� �ݾ�, ��ȭ �ܵ� �����͸� ���Ͽ� ����
	         
	      } while (extype.type != Constant.EX_TYPE_QUIT);
	      fw.fileClose();
	   }
}

