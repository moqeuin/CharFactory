package main;

import character.Knight;
import character.Magician;
import createCharacter.CreateChar;

public class mainClass {

	public static void main(String[] args) {
		// 상위클래스 캐릭터 생성.
		CreateChar cc1 = new CreateChar();
		// 하위클래스 나이트 생성.
		cc1.create(new Knight());
		// 하위클래스 나이트의 메소드를 통해서 웨폰과 아이템 객체를 생성 후 상위클래스의 저장.
		cc1.weapon.equipWeapon();
		cc1.item.excuteItem();
		
		// 상위클래스 캐릭터 생성.
		CreateChar cc2 = new CreateChar();
		// 하위클래스 매지션 생성.
		cc2.create(new Magician());
		// 하위클래스 매지션의 메소드를 통해서 웨폰과 아이템 객체를 생성 후 상위클래스의 저장.
		cc2.weapon.equipWeapon();
		cc2.item.excuteItem();		
	}
}