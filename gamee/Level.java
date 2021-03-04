package org.jgs2010.gamee;

public class Level {
	private int levelNum;        //各级别编号
	private int strLength;		 //各级别输出字符串长度
	private int strTimes;        //各级别输出字符串次数
	private int timeLimit;       //各级别玩家输入字符串时间限制
	private int perScore;        //各级别玩家输入正确加分 
	
	
	public Level() {
	}
	public Level(int levelNum, int strLength, int strTimes, int timeLimit, int perScore) {
		this.levelNum = levelNum;
		this.strLength = strLength;
		this.strTimes = strTimes;
		this.timeLimit = timeLimit;
		this.perScore = perScore;
	}
	public int getLevelNum() {
		return levelNum;
	}
	public void setLevelNum(int levelNum) {
		this.levelNum = levelNum;
	}
	public int getStrLength() {
		return strLength;
	}
	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}
	public int getStrTimes() {
		return strTimes;
	}
	public void setStrTimes(int strTimes) {
		this.strTimes = strTimes;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	public int getPerScore() {
		return perScore;
	}
	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}
	
	

}
