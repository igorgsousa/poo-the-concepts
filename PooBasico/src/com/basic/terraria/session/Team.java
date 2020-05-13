package com.basic.terraria.session;

import java.util.ArrayList;
import java.util.List;

import com.basic.terraria.characters.Player;

public class Team {
	
	private String name;
	private List<Player> players;

	public void addPlayer(Player player) {
		this.getPlayers().add(player);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Player> getPlayers() {
		if(this.getPlayers() == null) {
			this.players =  new ArrayList<>();
		}
		return players;
	}
}
