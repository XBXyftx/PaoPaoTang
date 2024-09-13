package cn.campsg.practical.bubble.util;

import cn.campsg.practical.bubble.entity.MovedStar;
import cn.campsg.practical.bubble.entity.Position;
import cn.campsg.practical.bubble.entity.Star;
import cn.campsg.practical.bubble.entity.Star.StarType;
import cn.campsg.practical.bubble.entity.StarList;

/**
 * 锟斤拷锟斤拷锟斤拷/锟斤拷锟狡讹拷锟斤拷锟斤拷锟斤拷实锟斤拷锟洁工锟斤拷锟洁，锟结供锟斤拷锟铰癸拷锟杰ｏ拷<br>
 * <ul>
 * <li>1. 锟斤拷锟斤拷指锟斤拷锟叫憋拷锟叫碉拷锟斤拷锟斤拷锟斤拷-锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷同锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷冒锟斤拷锟斤拷锟斤拷锟姐法锟斤拷锟斤拷</li>
 * <li>2. 锟斤拷指锟斤拷锟叫憋拷锟叫碉拷锟斤拷锟斤拷锟角帮拷锟叫凤拷锟介。</li>
 * <li>3. 锟斤拷隆一锟斤拷锟斤拷锟斤拷锟角讹拷锟斤拷</li>
 * </ul>
 * 
 * @see cn.campsg.practical.bubble.entity.Star
 * @see cn.campsg.practical.bubble.entity.MovedStar
 * 
 * 
 * @author Frank.Chen
 * @version 1.5
 *
 */
public class StarsUtil {
	
	/**
	 * 锟斤拷锟斤拷指锟斤拷锟叫憋拷锟叫碉拷锟斤拷锟斤拷锟斤拷<br>
	 * 锟斤拷锟斤拷锟斤拷颍喊锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷同锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷<br>
	 * 锟斤拷锟斤拷锟姐法锟斤拷冒锟斤拷锟斤拷锟斤拷
	 * 
	 * @param starList
	 *            锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷斜锟�
	 */
	/************ PRJ-BU2-JAVA-010 Task2 锟斤拷2/3 start锟斤拷***************/
	public static void sort(StarList starList){
		for(int i=0;i<starList.size()-1;i++){
			for(int j=0;j<starList.size()-i-1;j++){
				if(starList.get(j).getPosition().getRow()>starList.get(j+1).getPosition().getRow()){
					swap(starList.get(j), starList.get(j + 1));
				}
 			}
		}
	}
	
	/************ PRJ-BU2-JAVA-010 Task2 锟斤拷2/3 end锟斤拷*****************/
	
	/**
	 * 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟叫憋拷锟叫碉拷位锟斤拷
	 * 
	 * @param preStar
	 *            锟斤拷N锟斤拷锟斤拷锟斤拷锟斤拷
	 * @param nextStar
	 *            锟斤拷N+1锟斤拷锟斤拷锟斤拷锟斤拷
	 */
	/************ PRJ-BU2-JAVA-010 Task1 锟斤拷1/3 start锟斤拷***************/
	public static void swap(Star star1,Star star2){
		Star star = new Star(new Position(star1.getPosition().getRow(),star1.getPosition().getColumn()),star1.getType());
		star1.setPosition(new Position(star2.getPosition().getRow(),star2.getPosition().getColumn()));
		star1.setType(star2.getType());
		star2.setPosition(new Position(star.getPosition().getRow(),star.getPosition().getColumn()));
		star2.setType(star.getType());
	}

	public static void main (String[] args){
		Star star1=new Star(new Position(0,0),StarType.BLUE);
		Star star2 = new Star(new Position(1,1),StarType.GREEN);
		swap(star1,star2);
		System.out.println(star1.toString()+star2.toString());
		
		StarList starList = new StarList();
		starList.add(new Star(new Position(2,0),StarType.BLUE));
		starList.add(new Star(new Position(5,0),StarType.GREEN));
		starList.add(new Star(new Position(9,0),StarType.BLUE));
		starList.add(new Star(new Position(3,0),StarType.BLUE));
		starList.add(new Star(new Position(8,0),StarType.BLUE));
		sort(starList);
		System.out.println(starList.toString());
	}
	
	
	
	
	
	
	/************ PRJ-BU2-JAVA-010 Task1 锟斤拷1/3 end锟斤拷*****************/

	/**
	 * 锟斤拷隆一锟斤拷锟铰碉拷锟斤拷锟斤拷锟角★拷
	 * 
	 * @param star
	 *            锟斤拷锟斤拷隆锟斤拷锟斤拷锟斤拷锟斤拷
	 * @return 锟铰碉拷锟斤拷锟斤拷锟角ｏ拷锟斤拷锟斤拷锟节达拷锟街凤拷锟斤拷锟斤拷锟斤拷牵锟斤拷锟�
	 */
	public static Star copy(Star star) {

		Star ret = new Star();

		ret.setPosition(new Position(star.getPosition().getRow(), star
				.getPosition().getColumn()));
		ret.setType(star.getType());

		return ret;
	}

	public static MovedStar toMovedStar(Star star) {

		MovedStar ret = new MovedStar();

		ret.setPosition(new Position(star.getPosition().getRow(), star
				.getPosition().getColumn()));
		ret.setType(star.getType());

		return ret;
	}
}
