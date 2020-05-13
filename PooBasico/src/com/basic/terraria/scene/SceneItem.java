package com.basic.terraria.scene;

public abstract class SceneItem {
	
	private String name;
	
	private int positionY;
	private int positionX;

	public String getName() {
		return name;
	}
	
	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int getPossitionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public void setName(String name) {
		this.name = name;
	}
}
