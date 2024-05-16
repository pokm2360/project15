package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("input3.txt");

			byte[] arr = new byte[10];

			int size;

			while (true) {
				size = fis.read(arr);

				if (size == -1) {
					break;
				}
				for (int i = 0; i < size; i++) { // 마지막에 데이터를 가지고 올때를 생각해서 size 사용
					System.out.print((char) arr[i] + " ");
				}
				System.out.println(": " + size + "바이트 읽음");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}