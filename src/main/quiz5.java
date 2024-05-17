package main;

import java.io.FileWriter;
import java.io.IOException;

public class quiz5 {

	public static void main(String[] args) {

//		Filewriter를 사용하여 텍스트파일에 숫자 1부터 10중 짝수만 출력

		try {
			FileWriter fw = new FileWriter("quiz5.txt");

			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
//					fw.write(i); // 숫자로 인식 -> 코드체계에 따라 문자로 변환
					
					fw.write(i + " "); // 문자로 인식
				}
			}
			
//			버퍼 비우기 해야함!!
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	

	}

}
