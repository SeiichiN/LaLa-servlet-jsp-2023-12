package model;

public class SetResultLogic {
	public void execute(Player p) {
		if (p.getHand() == p.getTarget()) {
			p.setResult("引き分け");
		} else if ((p.getHand() + 1) % 3 == p.getTarget()) {
			p.setResult("ユーザーの勝ち");
		} else {
			p.setResult("コムの勝ち");
		}
	}
}
