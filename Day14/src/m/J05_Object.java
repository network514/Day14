package m;

import data.J05_MyCla;

public class J05_Object {
	public static void main(String[] args) {
		
//		Object 클래스
//		- 자바는 모든 클래스들이 자동으로 Object 클래스를 상속하도록 처리한다.
//		- 모든 클래스들의 최상위 수퍼클래스이다.
//		- Object 클래스를 통해서 상속 및 다형성의 기능을 효과적으로 이용할 수 있다.
		
		J05_MyCla my = new J05_MyCla();
//		my.
//		=> 아무런 멤버 변수 및 메소드가 없는 클래스를 작성하더라도 Object를 자동으로 상속하기 때문에
//		Object에서 명시한 메소드들의 이용이 가능한 상태이다.
		
//		1. toString()
//		클래스는 Object에서 명시한 toString 메소드를 오버라이드해서 클래스가 가지고 있는 
//		멤버변수를 제공(return)하도록 권장하고 있다. (오버라이드하지 않은 경우, 기본적으로 hashCode()의 결과가 제공된다.)
		
		System.out.println(my.toString());
		System.out.println(my);
		System.out.println(my.hashCode()); // 객체 고유번호
		System.out.printf("%x\n", my.hashCode());
		
		System.out.println(my.toString());
		
//		Object의 다형성 이용
		Object obj = new Object();
		obj = 10;
		obj = 1.2;
		obj = 'd';
		obj = "가나달";
		obj = new J05_MyCla();
//		=> 모든 클래스가 상속하므로 다형성 기능을 이용할 수 있음.
		
	}
}
