package m;

import inter.J02_Inter;
import data.*;

public class J02_Interface {
//	인터페이스
//	- 추상클래스의 특별한 형태
//	- 일반 멤버 변수 또는 생성자는 가질 수 없음
//	- 완성된 메소드도 가질 수 없음
	
	public static void main(String[] args) {
//		1. 인터페이스를 구체화한 클래스 객체의 이용
		J02_Inter in1 = null;
		
//		상황에 따라 인터페이스에 구현 클래스 객체를 연결한다.
		in1 = new J02_Implements();
		in1.setData();
		in1.getData();
		
//		2. 인터페이스를 통해서 일회성 구현 객체를 직접 만드는 경우
		J02_Interface in2 = new J02_Interface(){
			public void setData() {
				
			}
			public void getData() {
				
			}
		};
//		=> 인터페이스는 생성자가 없으므로 위와 같이 추상클래스들을 구현하는 경우,
//		구현된 메소드의 기능 호출이 가능한 구현클래스 객체 작성이 가능하다.
//		=> 익명클래스, 1회성 클래스 등이라 불린다.
	}
}
