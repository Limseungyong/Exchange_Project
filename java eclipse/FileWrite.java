package exchangeprogram;

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
			File file = new File("file_Address");			//데이터를 저장할 파일
			if (file.exists() == false) {												//파일의 존재 유무를 판별하기 위한 if문
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter("file_Address", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileClose() {															//파일 쓰기를 종료하기 위한 메소드
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException {										//파일에 헤더라인을 입력하기 위한 메소드
		if  (isFileExist == false) {													//새로 파일이 생성될 때 헤더라인 입력
			String head = "환전한 시간," + "환전할 화폐," + "환전할 금액," + "환전한 금액," + "거스름돈" + "\n";
			fw.write(head);	
		}
	}
	
	public void dataWrite(exchangetype extype) throws IOException {						//파일에 데이터를 입력하기 위한 메소드
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String result = sdf.format(c.getTime()) + "," + extype.exchange_type + "," + 
								   extype.w + "," + extype.cw + "," + extype.returnwon + "\n";
		fw.write(result);	
	}
}


