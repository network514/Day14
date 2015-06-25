package data;

public abstract class J01_SuperCla {
	public abstract void setData();
	public abstract void getData();
	
//	=> 다형성을 이용하기 위해 존재하는 메소드에 대해서는 몸체 부분을 없애고,
//	abstract 키워드를 명시함으로써 프로그램의 안정성을 높일 수 있다.
//	=> abstract 메소드 또는 추상메소드라고 부른다.
//	=> 추상메소드는 수퍼클래스를 상속받는 서브클래스들이 오버라이드를 통해서 
//	반드시 구체화해야만 한다.
//	=> abstract 메소드를 보유한 클래스에도 abstract 키워드가 선언되어야만 하는데,
//	이러한 클래스를 abstract 클래스 또는 추상클래스 라고 한다.
	
	String msg;
	
	public void mth() {
		System.out.println("추상클래스의 " + "일반 메소드");
	}
//	=> 추상클래스는 일반 멤버 변수 및 메소드를 가질 수 있다.
}
