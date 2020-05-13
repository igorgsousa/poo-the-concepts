package com.basic.terraria.session;

import java.util.ArrayList;
import java.util.List;

import com.basic.terraria.characters.Boss;
import com.basic.terraria.characters.Player;
import com.basic.terraria.interfaces.Damagable;
import com.basic.terraria.interfaces.Movable;
import com.basic.terraria.scene.SceneItem;

public class Scene {
	
	private List<SceneItem> sceneItems;
	private List<Player> players;
	private Boss currentBoss;
	private List<Team> teams;
	
	private int height = 101;
	private int width = 501;
	
	private int initialHeight = 51;
	private int initialWidth = 251;
	
	public void moveItem(Movable moveable, int x, int y ) {
		moveable.move(x, y);
	}
	
	public void distributeDamage(int i) {
		
		for(SceneItem sceneItem : this.getSceneItems()) {
			if(sceneItem instanceof Damagable) {
				Damagable damagable = (Damagable) sceneItem;
				damagable.takeDamage(i);
			}	
		}
	}
	
	private List<SceneItem> getSceneItems() {
		if(sceneItems == null) {
			this.sceneItems = new ArrayList<SceneItem>();
		}
		return sceneItems;
	}
	
	public void addSceneItem(SceneItem sceneItem ) {
		this.getSceneItems().add(sceneItem);
	}
	
	public void addSceneItem(Player player) {
		this.getPlayers().add(player);
		this.addSceneItem((SceneItem)player);
	}

	public void addSceneItem(Boss boss) {
		
		if(this.getCurrentBoss() == null) {
			this.setCurrentBoss(boss);
			this.addSceneItem((SceneItem)boss);
		}else {
			throw new RuntimeException("Ja existe um boss no cenario");
		}
	}

	private void setSceneItems(List<SceneItem> sceneItems) {
		this.sceneItems = sceneItems;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getInitialHeight() {
		return initialHeight;
	}

	public void setInitialHeight(int initialHeight) {
		this.initialHeight = initialHeight;
	}

	public int getInitialWidth() {
		return initialWidth;
	}

	public void setInitialWidth(int initialWidth) {
		this.initialWidth = initialWidth;
	}

	public List<Player> getPlayers() {
		if(players == null) {
			this.players = new ArrayList<>();
		}
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Boss getCurrentBoss() {
		return currentBoss;
	}

	public void setCurrentBoss(Boss currentBoss) {
		this.currentBoss = currentBoss;
	}
}
