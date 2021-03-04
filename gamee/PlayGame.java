package org.jgs2010.gamee;

public class PlayGame {
	public static void main(String[] args) {
		
		System.out.println("请完全按显示输入，每次根据输入难度将获得不等的积分，每次错误将扣除20分，不足则游戏结束。");
		Player player = new Player();
		player.play();
	}

}
