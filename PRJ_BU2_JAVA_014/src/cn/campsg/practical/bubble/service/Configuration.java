package cn.campsg.practical.bubble.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import cn.campsg.practical.bubble.entity.Score;

public class Configuration {
	Score score;
	public Configuration() {
		score = new Score();
		BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("score.conf")));
//		String[] splitLines;
		try {
//			splitLines = br.readLine().split("\n");
			score.setLevelScore(Integer.parseInt(br.readLine()));
			score.setStep(Integer.parseInt(br.readLine()));
			score.setIncrement(Integer.parseInt(br.readLine()));
			score.setLength(Integer.parseInt(br.readLine()));
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			score=null;
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			score=null;
		}
	}
	public Configuration(Score score){
		this.score = score;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public int nextLevelScore(int nextLevel) {
		if(score==null){
				return 0;
		}
		int sum=0;
		sum = this.getScore().getLevelScore() + this.getScore().getStep()+ (nextLevel-1)/this.getScore().getLength() * this.getScore().getIncrement();
		score.setLevelScore(sum);
		return score.getLevelScore();
	}
}
