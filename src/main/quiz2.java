package main;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		
//		scanner를 사용해 두자리 정수를 입력받기
//		그리고 십의 자리와 일의 자리의 합을 구하기
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int sum = (number / 10) + (number % 10);
		System.out.println(sum);
		
	}

}
