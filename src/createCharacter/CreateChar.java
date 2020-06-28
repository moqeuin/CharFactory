package createCharacter;

import character.Character_form;
import item.Item;
import weapon.Weapon;

public class CreateChar {
	public Weapon weapon;
	public Item item;
	
	// 하위 클래스인 ch(나이트, 매지션)의 인스턴스를 생성된 후 상위클래스 대신 메소드를 이용해서 인스턴스를 생성. 
	public void create(Character_form ch) {
		//생성된 인스턴스를 상위클래스의 변수에 저장.
		this.weapon = ch.createWeapon(); 
		this.item = ch.createItem();
	}
}