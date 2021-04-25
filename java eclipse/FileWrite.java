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
			File file = new File("file_Address");			//�����͸� ������ ����
			if (file.exists() == false) {												//������ ���� ������ �Ǻ��ϱ� ���� if��
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
	
	public void fileClose() {															//���� ���⸦ �����ϱ� ���� �޼ҵ�
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException {										//���Ͽ� ��������� �Է��ϱ� ���� �޼ҵ�
		if  (isFileExist == false) {													//���� ������ ������ �� ������� �Է�
			String head = "ȯ���� �ð�," + "ȯ���� ȭ��," + "ȯ���� �ݾ�," + "ȯ���� �ݾ�," + "�Ž�����" + "\n";
			fw.write(head);	
		}
	}
	
	public void dataWrite(exchangetype extype) throws IOException {						//���Ͽ� �����͸� �Է��ϱ� ���� �޼ҵ�
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String result = sdf.format(c.getTime()) + "," + extype.exchange_type + "," + 
								   extype.w + "," + extype.cw + "," + extype.returnwon + "\n";
		fw.write(result);	
	}
}


