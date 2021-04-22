package firstproject;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	   public static Scanner s = new Scanner(System.in);
	   public static void main(String[] args) throws IOException {
		  FileWrite fw = new FileWrite();
		  Output output = new Output();
	    
		
	      
		  exchangetype extype;
	      Processing pc = new Processing();
	      Input input = new Input();
	      
	      fw.headerWrite();
	      
	      do {
	    	  extype = new exchangetype();
	    	  extype.w = input.inputWon();
	    	  extype.type = input.inputType();
	         
	         if (extype.type == Constant.EX_TYPE_QUIT) {
	            break;
	         } else if(extype.type == Constant.EX_TYPE_USD) { 
	        	extype.exchange_type = "USD";
	        	extype.cw = (int)(extype.w / Constant.EX_USD);
	        	extype.returnwon = ((int)((extype.w / Constant.EX_USD - extype.cw)*Constant.EX_USD/10))*10;
	            pc.exchangeUSD(extype.w);  
	            
	         } else if(extype.type == Constant.EX_TYPE_EUR) {
	        	 extype.exchange_type = "EU";
	        	 extype.cw = (int)(extype.w / Constant.EX_EUR); 
	        	 extype.returnwon = ((int)((extype.w / Constant.EX_EUR - extype.cw)*Constant.EX_EUR/10))*10;
		        pc.exchangeEUR(extype.w);
		        
	         } else if(extype.type == Constant.EX_TYPE_JPY) {
	        	 extype.exchange_type = "JPY";
	        	 extype.cw = (int)(extype.w / Constant.EX_JPY);
	        	 extype.returnwon =	((int)((extype.w / Constant.EX_JPY - extype.cw)*Constant.EX_JPY/10))*10;
			    pc.exchangeJPY(extype.w);
	         } else {
	            System.out.println("잘못 입력하셨습니다.");
	         }   
	         
	         fw.dataWrite(extype);
	         
	      } while (extype.type != Constant.EX_TYPE_QUIT);
	      fw.fileClose();
	   }
	}

