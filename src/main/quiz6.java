package main;

import java.io.FileWriter;
import java.io.IOException;

public class quiz6 {

	public static void main(String[] args) {
	
//		FileWriter를 사용해 구구단 출력
		
		try {
			FileWriter fw = new FileWriter("quiz6.txt");

			for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					fw.write(i + " * " + j + " = " + i*j);
					fw.write('\n');
				}

				fw.write('\n');
			}
			
//			버퍼 비우기 해야함!!
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
