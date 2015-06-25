package m;

import java.util.*;

public class J08_Date {
	public static void main(String[] args) {
//		Date 클래스 
//		- java.util 패키지에 위치함
//		- 1970년 1월 1일 0시 0분 0초를 기준으로 현재시간을 초단의 (1/1000단위)로 제공함
//		- 제공되는 결과 형태 : long
		
		long t1 = System.currentTimeMillis();
		System.out.println("t1 = " + t1);
		
		Date d1 = new Date();
		String d2 = d1.toString();
		System.out.println("d2 : " + d2);
//		=> 현재 시간 정보가 d2로 객체화됨
		
		String[] p = d2.split(" ");
		for(int i=0; i<p.length; i++){
			System.out.println("p["+i+"] = " + p[i]);
		}
	}
}
