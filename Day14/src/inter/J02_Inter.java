package inter;

public interface J02_Inter {
	
//	String n; //에러 
//	=> 일반 멤버 변수 불가능
	
	String m = "값을 가지는 변수";
//	static final String m = "값을 가지는 변수";
	
//	=>인터페이스는 반드시 초기화된 멤버 변수만 가질 수 있다.
//	=> 자동으로 static final 상태가 된다.
//	static : 객체와 상관없이 존재하는 클래스 멤버 변수
//	final : 변경이 불가능한 상태로 변수를 변환함
	
//	public J02_Inter(){}
//	=> 생성자를 가질 수 없다.
//	=> 단, 인터페이스가 가진 추상메소드들을 구체화(오버라이드)하면, 객체 구현이 가능하다.
	
//	public void mth(){
//		System.out.println("일반 메소드");
//	}
//	=> 인터페이스는 구체화된 메소드를 가질 수 없다.
	
	public abstract void setData();
	public void getData();
//	=> 인터페이스는 기본적으로 모든 메소드들에 대하여 자동으로 abstract 상태를 적용한다.
}