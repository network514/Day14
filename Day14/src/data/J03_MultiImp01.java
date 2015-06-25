package data;

import inter.J03_in01;
import inter.J03_in02;

public class J03_MultiImp01 implements J03_in01, J03_in02 {
//	=> 클래스 상속과는 달리, 하나의 클래스는 여러개의 인터페이스를 구체화작업 할 수 있다.
	@Override
	public void in02mth() {
		
	}

	@Override
	public void in01mth() {
		
	}
//	구체화(implements) 선언한 모든 인터페이스의 메소드를 오버라이드 해야만 한다.
}
