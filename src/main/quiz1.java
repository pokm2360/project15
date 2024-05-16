package main;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		
//		5개 크기의 정수형 배열 생성
		int[] arr = new int[5];
		
//		scanner를 사용해 배열에 숫자 5개 입력
		Scanner scanner = new Scanner(System.in);
		
//		배열 요소의 합
//		arr[0] = scanner.nextInt();
//		arr[1] = scanner.nextInt();
//		arr[2] = scanner.nextInt();
//		arr[3] = scanner.nextInt();
//		arr[4] = scanner.nextInt();
		
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}
