package m;

import data.*;

public class J01_Abstract {
	public static void main(String[] args) {
//		1. 다형성 이용의 예
		J01_SubCla sub = new J01_SubCla();
		J01_SuperCla sup;
		sup = sub;
		
//		2. 추상클래스 객체 이용의 예
		J01_SuperCla pp = new J01_SuperCla() {
			
			@Override
			public void setData() {
				System.out.println("객체생성시 완성해야할 오버라이드 메소드");
			}
			
			@Override
			public void getData() {
				System.out.println("객체생성시 완성해야할 오버라이드 메소드");
			}
		};
	}
}
