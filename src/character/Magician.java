package character;

import item.Item;
import item.Potion;
import weapon.Wand;
import weapon.Weapon;

public class Magician implements Character_form {

	@Override
	public Weapon createWeapon() {		
		return new Wand();
	}
	@Override
	public Item createItem() {	
		return new Potion();
	}	
}