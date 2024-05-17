package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("reader.txt");
			
			while(true) {
				int i = fis.read(); // 1바이트씩 읽기
				
				if (i == -1) {
					break;
				}
				
				System.out.print((char) i); // 한글은 1바이트로 표현할 수 없어서 모두 깨짐
			}
			
			System.out.println();
			
//			문자 입력 스트림 생성
			FileReader fr = new FileReader("reader.txt");
			
			while(true) {
				int i = fr.read(); // 2바이트씩 읽기
				
				if (i == -1) {
					break;
				}
				
				System.out.print((char) i); // 한글이 제대로 읽어옴
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
