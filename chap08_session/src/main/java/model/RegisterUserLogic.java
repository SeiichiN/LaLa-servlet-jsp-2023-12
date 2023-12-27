package model;

import java.util.Random;

public class RegisterUserLogic {
	
	public boolean execute(User user) {
		int num = new Random().nextInt(10);
		if (num % 2 == 0) {
			System.out.println(user.getName() + "をDBに保存しました");
			return true;
		}
		System.out.println(user.getName() + "をDBに保存できません");
		return false;
		
	}
}
