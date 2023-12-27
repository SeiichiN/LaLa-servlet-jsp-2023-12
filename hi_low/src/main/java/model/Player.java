package model;

import java.io.Serializable;

public class Player implements Serializable {
	private int number;
	private String msg;
	
	public Player() {}

	public Player(int number, String msg) {
		this.number = number;
		this.msg = msg;
	}

	public int getNumber() {
		return number;
	}

	public String getMsg() {
		return msg;
	}
	
}
