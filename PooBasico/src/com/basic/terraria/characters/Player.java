package com.basic.terraria.characters;

import com.basic.terraria.equipable.ChestArmor;
import com.basic.terraria.session.Team;

public class Player extends Character {
	
	private ChestArmor chest;
	private Team team;
	
	
	public void move(int x, int y) {
		System.out.print("Ande para as coordenadas (x,y");
	}
	
	public ChestArmor getChest() {
		return chest;
	}

	public void setChest(ChestArmor chest) {
		this.chest = chest;
	}
	
	@Override
	public void die() {
		System.out.println("Deixar cair moedas");
		System.out.println("Criar lapide com descricao da morte");
	}
	
	@Override
	public void takeDamage(int damage) {
		
		int resultDamage = damage -  this.getChest().getArmor();
		
		if(resultDamage > 0) {
			super.takeDamage(resultDamage);
		}
	}

	public void openInventary() {
		System.out.println("Abrir inventario");
	}
	public void useEquipedItem() {
		System.out.println("Usar item equipado");
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
