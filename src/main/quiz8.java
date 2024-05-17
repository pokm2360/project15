package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class quiz8 {

	public static void main(String[] args) {

//		다운로드 폴더에 있는 파일 목록을 읽어서 텍스트 파일에 출력
		File f = new File("C:\\Users\\G201\\Downloads");

		File[] files = f.listFiles();

		try {
			FileWriter	fw = new FileWriter("quiz8.txt");
		
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String filename = file.getName();
			
			fw.write(filename + "\n");
		}
		
		fw.flush();
		
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
