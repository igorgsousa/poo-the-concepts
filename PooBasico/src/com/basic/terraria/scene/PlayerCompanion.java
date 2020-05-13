package com.basic.terraria.scene;

import com.basic.terraria.interfaces.Movable;

public class PlayerCompanion extends SceneItem implements Movable{

	@Override
	public void move(int x, int y) {
		System.out.println("pule, voe ou atravesse bloco solidos");
	}

}
