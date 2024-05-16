package main;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		
//		scanner / while루프를 사용해 문자열을 입력받고
//		문자열이 stop이면 루프를 종료
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("문자를 입력하세요:");		
			String str = sc.nextLine();

//			str은 클래스 객체이므로 비교연산자를 사용하면 주소값을 참조하기 때문에 사용 불가능
			if(str.equalsIgnoreCase("STOP")) {
				break;
			}
			
		}
	}

}
