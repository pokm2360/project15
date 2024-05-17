package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class quiz7 {

	public static void main(String[] args) {

//		FileOutputStream 과 보조스트림을 사용하여 파일에 "프로그래밍" 출력

		try {
			FileOutputStream fos = new FileOutputStream("quiz7.txt");

			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
//			osw.write('프');
//			osw.write('로');
//			osw.write('그');
//			osw.write('래');
//			osw.write('밍');
			osw.write("프로그래밍");
			
//			OutputStreamWriter도 버퍼를 사용함
//			버퍼 비워주기!!
			osw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
