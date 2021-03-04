package org.jgs2010.gamee;

import java.util.Random;

public class Game {
	private Player player;

	public Game() {
		super();
	}

	public Game(Player player) {
		super();
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	//输出字符串方法
	public String printStr() {
		Random random = new Random();
		String output = new String();
		
		for (int i = 0; i < LevelParam.levels[player.getLevelNow()-1].getStrLength(); i++) {
			char element = (char)(random.nextInt(26)+97);
			output += element;
		}
		System.out.println(output);
		return output;
	}
	
	//判断玩家输入是否正确
	public Boolean judge(String out,String in) {
		
		if (out.equals(in)) {
			
			return true;
		}
		else {
		
			return false;
			
		
		}
		
	}

}





