package m;

import java.util.*;

public class J07_Scanner {
	public static void main(String[] args) {
//		Scanner 클래스
//		- java.util 패키지에 위치함
//		- 콘솔로부터 데이터 입력을 받는 클래스
		
		Scanner scan = new Scanner(System.in);
//		=> System.in 은 콘솔로부터 들어오는 정보의 흐름을 말한다.
//		=> 정보 추출 후 프로그램 영역으로 제공한다.
		
//		1. .nextLine()
//		- 엔터 단위로 문자열을 입력받아서 제공하는 메소드
//		- String 형태로 제공
		System.out.println("메시지 입력하세요");
		String rcv = scan.nextLine();
		System.out.println("rcv : " + rcv);
		
//		2. 각 자료형 데이터 입력
		System.out.println("정수 입력");
		int r1 = scan.nextInt(); // 정수 입력
		System.out.println("r1 = " + r1);
		
		System.out.println("실수 입력");
		double r2 = scan.nextDouble(); // 정수 입력
		System.out.println("r2 = " + r2);
		
	}
}
