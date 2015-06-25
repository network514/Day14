package m;

public class J06_String {
	public static void main(String[] args) {
//		String 클래스
//		- 문자열 처리를 전담하는 클래스
//		- 본래적으로 new로 객체를 만들어서 문자열을 저장-이용해야 하지만 
//		특별히 new가 없이도 데이터를 처리할 수 있다.

		String s1 = "java";
		String s2 = new String("java");
		String s3 = "java";
		
		boolean r1 = s1 == s2;
		System.out.println("r1 : " + r1);
		
		boolean r2 = s1 == s3;
		System.out.println("r2 : " + r2);
//		=> 기호는 레퍼런스의 통일성을 확인하므로, 문자열 값의 동일성을 확인하고자 하는 경우
//		.eqals()를 사용해야 한다.
		
		boolean p1 = s1.equals(s2);
		System.out.println("p1 : " + p1);
		boolean p2 = s1.equals(s3);
		System.out.println("p2 : " + p2);
		
//		String 클래스의 주요 메소드
//		1. equals() : 문자열의 동일성 확인
		String st1 = "가나다라";
		String st2 = new String("가나다라");
		System.out.println("#1. equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals("가나다"));
		
//		2. 문자열의 길이 제공
		String q1 = "가나다라";
		String q2 = "12345678";
		System.out.println("#.2 length()");
		System.out.println(q1.length());
		System.out.println(q2.length());
		
//		3.subString() : 문자열 잘라내기
		String t = "123456789";
		String rest = t.substring(3);
//		=> 지정한 인덱스 번호 전까지 버리고 지정한 번호부터 선택함.
//		=> 문자열의 인덱스 번호가 0부터 시작함
		System.out.println("#.3 subString()");
		System.out.println(rest);		
		String restt = t.substring(3,6);
		System.out.println(restt);
//		=> 문자열 인덱스 번호 3번부터 선택하여 인덱스 번호 6번 전까지만 추출
		
//		4. contains() : 문자열 존재 여부 확인
		String c = "abcd 1234 가나다";
		boolean cc = c.contains("cd");
		System.out.println("#4. contains()");
		System.out.println(cc);
	}
}
