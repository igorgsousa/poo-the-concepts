package com.basic.terraria.scene.blocks;

import com.basic.terraria.interfaces.Damagable;
import com.basic.terraria.scene.SceneItem;

public class RockBlock extends SceneItem  implements Damagable {

	@Override
	public void takeDamage(int damage) {
		System.out.println("Destroe o bloco e o joga no chao");
	}

}
