package com.basic.main;

import com.basic.terraria.characters.Boss;
import com.basic.terraria.characters.Character;
import com.basic.terraria.characters.Player;
import com.basic.terraria.scene.Chest;
import com.basic.terraria.scene.PlayerCompanion;
import com.basic.terraria.scene.SceneItem;
import com.basic.terraria.session.Scene;

public class Main {

	public static void main(String[] args) {
		
		Scene scene = new Scene();
		
		Player player = new Player();
		player.setLife(400);
		player.setName("chorao");

		Boss boss = new Boss();
		boss.setName("Olho de cthulhu");
		boss.setLife(6000);
		
		PlayerCompanion companion = new PlayerCompanion();
		companion.setName("Demonio");
		
		scene.addSceneItem(player);
		scene.addSceneItem(boss);
		scene.addSceneItem(companion);
		
		scene.moveItem(player, 50, 89);
		scene.moveItem(companion, 50, 93);
		scene.moveItem(boss, 96, 119);
		
		scene.distributeDamage(30);
		
		
//		scene.getSceneItems().add(player);
//		scene.getSceneItems().add(chest);
//		scene.getSceneItems().add(chest2);
		
		
		
		
		
	}
}




/*
 * Boss boss = new Boss(); boss.setLife(6000); boss.setName("Olho de cthulhu");
 * boss.atack();
 * 
 * Npc npc = new Npc(); npc.setLife(100); npc.setName("Durim");
 * npc.doSomeAction();
 */