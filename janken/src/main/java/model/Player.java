package model;

import java.io.Serializable;

public class Player implements Serializable {
	private int hand;
	private int com;
	private String result;
	
	Player() {}

	public Player(int hand, int com) {
		this.hand = hand;
		this.com = com;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getHand() {
		return hand;
	}

	public int getCom() {
		return com;
	}
	
}
