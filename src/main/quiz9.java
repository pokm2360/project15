package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class quiz9 {

//	public static void main(String[] args) {

//		다운로드 폴더에 있는 파일의 목록을 읽어서 텍스트 파일에 출력
//		하위 폴더가 있다면, 하위 폴더의 파일목록도 출력
//		재귀함수 활용해보기 ex)팩토리얼

//		File f = new File("C:\\Users\\G201\\Downloads");
//		File[] files = f.listFiles();
//
//		if (files != null) {
//			try {
//				FileWriter fw = new FileWriter("quiz9.txt");
//				
//				for (File file : files) {
//					String filename = file.getName();
//					fw.write(filename + "\n");
//				}
//			fw.flush();
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} 
	
	public static void writeFilenamesToFile(String directoryPath, String outputFilePath) {
		File directory = new File("C:\\Users\\G201\\Downloads");
		File[] files = directory.listFiles();

		try (FileWriter fw = new FileWriter("quiz9.txt")) {
			listFilesRecursive(files, fw);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void listFilesRecursive(File[] files, FileWriter fw) throws IOException {
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					// 재귀
					listFilesRecursive(file.listFiles(), fw);
				} else {
					String filename = file.getName();
					fw.write(filename + "\n");
				}
			}
		}
	}

	public static void main(String[] args) {
		writeFilenamesToFile("C:\\Users\\G201\\Downloads", "quiz9.txt");
	}
	}

	

