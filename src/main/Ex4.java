package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) {
		
//		입력 스트림 생성
//		한글은 바이트 스트림으로 읽을 수 없음
		try {
			FileInputStream fis = new FileInputStream("input2.txt");
			
//			반복문을 사용해서 파일 내용 끝까지 읽기
			while(true) {
				int i = fis.read(); // 1바이트씩 읽기
				
				if (i == -1) { // 파일 끝에 도달하면 -1 반환
					break;
				}
//				문자로 변환해 출력
				System.out.println((char) i);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
