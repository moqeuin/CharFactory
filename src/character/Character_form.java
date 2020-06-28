package character;

import item.Item;
import weapon.Weapon;

public interface Character_form {
	public Weapon createWeapon();
	public Item createItem();	
}