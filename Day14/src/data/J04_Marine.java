package data;

import javax.swing.JOptionPane;

import inter.*;

public class J04_Marine implements J04_Unit{
	
	String name ="마린";
	int att = 10;

	public void attack() {
		JOptionPane.showMessageDialog(null, name + "이 적을 공격합니다. (공격력 : " + att + ")");
	}

	public void move(int x, int y) {
		JOptionPane.showMessageDialog(null, name  + "이 지상으로 [" + x + "," + y +"] 좌표로 걸어서 이동합니다.");
	}

}
