package data;

public class J01_SubCla extends J01_SuperCla {
//	=> 추상클래스를 상속하는 경우 추상클래스가 가지고 있는 
//	추상메소드를 반드시 구체화(오버라이드) 하도록 강요한다. 
	
	@Override
	public void setData() {
		System.out.println("서브클래스의 오버라이드 메소드");		
	}

	@Override
	public void getData() {
		System.out.println("서브클래스의 오버라이드 메소드");		
	}
}
