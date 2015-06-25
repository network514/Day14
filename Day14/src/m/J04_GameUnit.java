package m;

import javax.swing.JOptionPane;

import data.*;
import inter.*;

public class J04_GameUnit {
	public static void main(String[] args){
		
		J04_Unit unit = null;
		
		String showMenu = "1. 마린 \n2. 레이스 \n유닛 선택";
		String menu = null;
		
		while(true){
			menu = JOptionPane.showInputDialog(showMenu);
			
			if(menu.equals("1")){
				unit = new J04_Marine();
			}else if(menu.equals("2")){
				unit = new J04_Wraith();
			}else{
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
				continue;
//				=> while문의 조건식으로 올라감
			}
			
			menu = JOptionPane.showInputDialog("1. 공격하기 \n2. 이동하기\n 번호선택");
			if(menu.equals("1")){
				unit.attack();
			}else if(menu.equals("2")){
				unit.move(5, 9);
			}else{
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
				continue;
			}
		}
	}
}
