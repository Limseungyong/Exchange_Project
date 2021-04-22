package firstproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWrite {
	private FileWriter fw;
	private boolean isFileExist;
	
	public FileWrite() {		
		try {
			File file = new File("C:\\Users\\임승용\\Desktop\\exchange.csv");
			if (file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter("C:\\Users\\임승용\\Desktop\\exchange.csv", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException {
		// TODO Auto-generated method stub
		
		if  (isFileExist == false) {
			String head = "날짜," + "환전대상," + "금액," + "환전결과," + "거스름돈" + "\n";
			fw.write(head);	
		}
	}
	
	public void dataWrite(exchangetype extype) throws IOException {
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String result = sdf.format(c.getTime()) + "," + extype.exchange_type + "," + extype.w + "," + extype.cw + "," + extype.returnwon + "\n";
		fw.write(result);	
	}
}
