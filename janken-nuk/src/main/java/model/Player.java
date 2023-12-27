package model;

import java.io.Serializable;

public class Player implements Serializable {
	private int hand;
	private int target;
	private String result;
	
	public Player() {}
	public Player(int hand, int target) {
		this(hand, target, null);
	}
	public Player(int hand, int target, String result) {
		this.hand = hand;
		this.target = target;
		this.result = result;
	}
	public int getHand() {
		return hand;
	}
	public String getResult() {
		return result;
	}
	public int getTarget() {
		return target;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
