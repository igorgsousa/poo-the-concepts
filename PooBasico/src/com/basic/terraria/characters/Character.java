package com.basic.terraria.characters;

import com.basic.terraria.interfaces.Damagable;
import com.basic.terraria.interfaces.Movable;
import com.basic.terraria.scene.SceneItem;

public abstract class Character extends SceneItem implements Damagable, Movable{
	
	private int life;
	private int maxLife;
	
	public void takeDamage(int damage) {
		if(damage > this.getLife()) {
			this.setLife(this.getLife() - damage);
		}else {
			die();
		}
	}
	
	public abstract void die();
	
	public int getLife() {
		return life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}

	public int getMaxLife() {
		return maxLife;
	}

	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
}
