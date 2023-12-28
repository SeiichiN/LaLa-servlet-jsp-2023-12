package model;

public class SetResultLogic {
	public void execute(Player p) {
		if (p.getHand() == p.getCom()) {
			p.setResult("引き分けです");
		} else if ((p.getHand() + 1) % 3 == p.getCom()) {
			p.setResult("ユーザーの勝ちです");
		} else {
			p.setResult("コムの勝ちです");
		}
	}
}
