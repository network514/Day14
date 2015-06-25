package m;

import java.text.*;
import java.util.Date;

public class J09_SimpleDateFormat {
	public static void main(String[] args) {
//		SimpleDateFormat 클래스
//		- java.text 패키지에 위치
//		- Date 타입 등 시간에 대한 정보를 원하는 형식의 문자열 형태로 제공하는 클래스
//		- 형식 설정 규칙은 API 참고 (www.oracle.com)
		
		long d1 = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String s1 = sdf.format(d1);
		System.out.println("s1 : " + s1);
		String s2 = sdf2.format(d1);
		System.out.println("s2 : " + s2);
		
		Date d2 = new Date();
		sdf = new SimpleDateFormat("MM dd (EE)");
		String s3 = sdf.format(d2);
		System.out.println("s3 : " + s3);
	}
}
