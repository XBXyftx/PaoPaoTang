package cn.campsg.practical.bubble.service;

import cn.campsg.practical.bubble.entity.Position;
import cn.campsg.practical.bubble.entity.Star;
import cn.campsg.practical.bubble.entity.Star.StarType;
import cn.campsg.practical.bubble.entity.StarList;

public class StarServiceTester implements StarService  {

	@Override
	public StarList createStars() {
		StarList stars = new StarList();
		
		Star star = new Star();
		// 设置泡泡糖在画面上的位置
		star.setPosition(new Position(0, 0));
		star.setType(StarType.BLUE);
		// 加入列表
		stars.add(star);
		
		star = new Star();
		// 设置泡泡糖在画面上的位置
		star.setPosition(new Position(0, 1));
		star.setType(StarType.GREEN);
		// 加入列表
		stars.add(star);
		
		star = new Star();
		// 设置泡泡糖在画面上的位置
		star.setPosition(new Position(1, 0));
		star.setType(StarType.PURPLE);
		// 加入列表
		stars.add(star);
		
		star = new Star();
		// 设置泡泡糖在画面上的位置
		star.setPosition(new Position(1, 1));
		star.setType(StarType.YELLOW);
		// 加入列表
		stars.add(star);
		
		star = new Star();
		// 设置泡泡糖在画面上的位置
		star.setPosition(new Position(0, 2));
		star.setType(StarType.RED);
		// 加入列表
		stars.add(star);
		

		
		return stars;
	}

	@Override
	public StarList tobeClearedStars(Star base, StarList sList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StarList getYMovedStars(StarList clearStars, StarList currentStarList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StarList getXMovedStars(StarList currentStarList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean tobeEliminated(StarList currentStarList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StarList getAwardStarList(StarList currentStarList) {
		// TODO Auto-generated method stub
		return null;
	}

}
