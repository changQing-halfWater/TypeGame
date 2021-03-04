package org.jgs2010.gamee;

public class LevelParam {
	public static final Level levels[] = new Level[6];
	static {
		//级别，字符串长度，次数，时间限制，积分
		levels[0] = new Level(1,2,3,5,2);
		levels[1] = new Level(2,3,3,5,3);
		levels[2] = new Level(3,3,3,5,4);
		levels[3] = new Level(4,4,4,10,5);
		levels[4] = new Level(5,4,4,10,6);
		levels[5] = new Level(6,5,4,10,7);
	}

}
