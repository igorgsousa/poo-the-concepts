package com.basic.terraria.scene;

import com.basic.terraria.interfaces.Damagable;

public class Chest extends SceneItem   implements Damagable{
	
	public void openChest() {
		System.out.println("Abriu o bau");
	}
	
	@Override
	public void takeDamage(int damage) {
		
		
	}

}
