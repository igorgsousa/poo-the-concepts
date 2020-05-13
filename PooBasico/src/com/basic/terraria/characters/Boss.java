package com.basic.terraria.characters;

public class Boss extends Character {
	
	public void move(int x, int y) {
		System.out.print("Mova para as coordenadas (x,y");
	}
	
	@Override
	public void die() {
		System.out.println("Deixar cair sacola de recompensa");
	}
	
	public void atack() {
		if(this.getLife() >= (this.getLife() / 2)) {
			System.out.print("Ataque o jogador mais proximo com ataque 1");
		}else {
			System.out.print("Ataque o jogador mais proximo com ataque 2");
		}
	}
}
