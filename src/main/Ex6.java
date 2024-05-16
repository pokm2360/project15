package main;

import java.io.FileOutputStream;

public class Ex6 {

	public static void main(String[] args) {

		try {
//			출력 스트림 생성 (파일이 있으면 연결, 없으면 자동으로 생성됨
			FileOutputStream fos = new FileOutputStream("output.txt");
			
			byte a = 65;
			byte b = 66;
			
			fos.write(a); // 65 -> A 문자로 변환되어 저장됨
			fos.write(b);
			fos.write('C'); // 문자 그대로 저장
			
		} catch (Exception e) {

		}
		
	}

}
