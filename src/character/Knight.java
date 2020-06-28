package character;

import item.Item;
import item.Scroll;
import weapon.Sword;
import weapon.Weapon;

public class Knight implements Character_form {

	@Override
	public Weapon createWeapon() {
		return new Sword();
	}
	@Override
	public Item createItem() {
		return new Scroll();
	}	
}