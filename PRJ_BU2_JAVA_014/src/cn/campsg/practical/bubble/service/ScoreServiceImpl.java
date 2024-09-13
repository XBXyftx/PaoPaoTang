package cn.campsg.practical.bubble.service;

import cn.campsg.practical.bubble.entity.StarList;

/**
 * 
 * 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷为锟斤拷锟斤拷锟结供锟斤拷锟铰癸拷锟斤拷<br>
 * 1. 锟斤拷锟斤拷乜锟酵拷胤锟斤拷锟�<br>
 * 2. 锟叫癸拷锟叫讹拷<br>
 * 3. 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟捷硷拷锟斤拷梅锟�<br>
 * 4. 锟斤拷锟斤拷剩锟斤拷锟斤拷锟斤拷锟角的得分斤拷锟斤拷<br>
 * 
 * @author Frank.Chen
 * @version 1.1
 *
 */
public class ScoreServiceImpl implements ScoreService {

	/*******PRJ-BU2-JAVA-014 Test1 锟斤拷1/3 Start锟斤拷************/
	/**
	 * 锟斤拷玫锟角帮拷氐锟酵拷胤锟斤拷锟�
	 * 
	 * @return 锟斤拷锟斤拷锟斤拷牡梅锟�
	 * 
	 */
	Configuration config = null;
	public ScoreServiceImpl() {
		this.config = new Configuration();
	}
	
//	public ScoreServiceImpl(Configuration config) {
//		this.config = config;
//	}
	@Override
	public int getCurrentLevelScore() {
		int score = 0;
		config.getScore().getLevelScore(); 
		return config.getScore().getLevelScore();
	}
	/*******PRJ-BU2-JAVA-014 Test1 锟斤拷1/3 End锟斤拷**************/
	
	/**
	 * 锟斤拷锟斤拷要锟叫伙拷锟侥关匡拷锟饺硷拷锟斤拷取目锟斤拷锟斤拷锟�
	 * 	
	 * @param 锟斤拷一锟截关匡拷
	 * @return 锟斤拷锟斤拷锟斤拷牡梅锟�
	 * 
	 */
	/*******PRJ-BU2-JAVA-014 Test2 锟斤拷2/3 Start锟斤拷************/
	@Override
	public int nextScoreByLevel(int nextLevel) {
//		int score = 0;
//		score = config.getScore().getLevelScore() + config.getScore().getStep() + (nextLevel-1)/config.getScore().getLength() * config.getScore().getIncrement();
		return config.nextLevelScore(nextLevel);
	}
	/*******PRJ-BU2-JAVA-014 Test2 锟斤拷2/3 End锟斤拷**************/

	/**
	 * 锟斤拷锟捷憋拷锟截匡拷锟斤拷锟斤拷锟斤拷锟斤拷氐墓乜锟斤拷梅锟�
	 * 
	 * @param level
	 *            锟斤拷一锟截关匡拷
	 * @return 锟斤拷锟截的关匡拷锟矫凤拷
	 */
	
	@Override
	public boolean isChangeLevel(int score) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public int getScoreByStars(StarList stars) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getScoreByStars(int stars) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAwardScore(int awardStarNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isNoticePassLevel(int currentLevel, int score) {
		// TODO Auto-generated method stub
		return false;
	}

}
