package com.basic.terraria.characters;

public class Npc extends Character{
	
	public void move(int x, int y) {
		System.out.print("Ande para as coordenadas (x,y");
	}
	
	public void doSomeAction() {
		System.out.println("Abrir janela de venda");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
}
