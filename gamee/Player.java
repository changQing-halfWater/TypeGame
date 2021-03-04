package org.jgs2010.gamee;

import java.util.Scanner;


public class Player {
	private int levelNow;       //玩家当前级别
	private int currScore;      //玩家当前积分
	private long startTime;     //玩家关卡开始时间
	private int elapedTime;     //玩家关卡耗时
	
	
	public Player() {
		super();
	}
	public Player(int levelNow, int currScore, long startTime, int elapedTime) {
		super();
		this.levelNow = levelNow;
		this.currScore = currScore;
		this.startTime = startTime;
		this.elapedTime = elapedTime;
	}
	public int getLevelNow() {
		return levelNow;
	}
	public void setLevelNow(int levelNow) {
		this.levelNow = levelNow;
	}
	public int getCurrScore() {
		return currScore;
	}
	public void setCurrScore(int currScore) {
		this.currScore = currScore;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public int getElapedTime() {
		return elapedTime;
	}
	public void setElapedTime(int elapedTime) {
		this.elapedTime = elapedTime;
	}

	
	public void play() {
	
		Game game = new Game(this);
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < LevelParam.levels.length; i++) { //6个级别，6次循环
			//关卡计时
			startTime = System.currentTimeMillis();
			//每关开始升一级
			this.levelNow+=1;
			//this.currScore = 0;
			for (int j = 0; j < LevelParam.levels[levelNow-1].getStrTimes(); j++) { //内层循环，以各级别字符串输出次数为循环次数
				//游戏生成字符串
				String output = game.printStr();
				//单次计时
				long firstTime = System.currentTimeMillis();
				
				//玩家输入字符串
				String input = scanner.next();
				
				//单次计时
				long lastTime = System.currentTimeMillis();
				
				//判断输入是否正确
				if (game.judge(output, input)) {
					currScore += LevelParam.levels[levelNow-1].getPerScore();
					System.out.println("输入正确，您当前的等级是："+levelNow+"级，当前积分为："+currScore+"分");
				}
				else {
					if (currScore>20) {
						currScore -= 20;
						System.out.println("输入错误，扣除20分复活,当前积分："+currScore);
					}
					else {
						System.out.println("输入错误,积分不足以扣除复活，游戏结束！");
						System.exit(1);
					}
					
				}
			
				
				System.out.println("用时："+(lastTime-firstTime)/1000+"秒");
				
				
				//超时提示
				if ((lastTime-firstTime)/1000>LevelParam.levels[levelNow-1].getTimeLimit()) {
					System.out.println("您太慢了，游戏结束");
					System.exit(1);
				}
			}
			//关卡计时
			long endTime = System.currentTimeMillis();
			
			//升级提示
			System.out.println("恭喜升级，本关卡用时："+(endTime-startTime)/1000+"秒");
			
			//通关提示
			if (levelNow==6) {
				System.out.println("您已经通过所有关卡，恭喜！");
			}
			
		}
		
	}
}
