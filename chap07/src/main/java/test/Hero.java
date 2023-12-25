package test;

import java.io.Serializable;

public class Hero implements Serializable {
	private String name;
	private int hp;
	private int mp;
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 50;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}


	public int getMp() {
		return mp;
	}

}
