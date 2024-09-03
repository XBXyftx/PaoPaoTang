package cn.campsg.practical.bubble.service;

import cn.campsg.practical.bubble.entity.Position;
import cn.campsg.practical.bubble.entity.Star;
import cn.campsg.practical.bubble.entity.StarList;
import cn.campsg.practical.bubble.entity.Star.StarType;

/**
 * 
 * 锟斤拷锟斤拷锟斤拷业锟斤拷锟斤拷锟斤拷锟斤拷锟洁，锟斤拷锟斤拷为锟斤拷锟斤拷锟结供锟斤拷锟铰凤拷锟斤拷<br>
 * 1. 锟斤拷锟斤拷锟斤拷幕锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�<br>
 * 2. 锟叫癸拷锟叫讹拷<br>
 * 3. 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟捷硷拷锟斤拷梅锟�<br>
 * 4. 锟斤拷锟斤拷剩锟斤拷锟斤拷锟斤拷锟角的得分斤拷锟斤拷<br>
 * 
 * @author Frank.Chen
 * @version 2.5
 *
 */
public class StarServiceImpl implements StarService {
	
	/**
	 * 锟斤拷锟斤拷锟斤拷幕锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷牵锟�10 * 10锟斤拷
	 * 
	 * @return 锟斤拷锟斤拷锟斤拷锟叫憋拷-锟斤拷锟斤拷锟斤拷锟斤拷示
	 */
	@Override
	public StarList createStars() {
		Star star1 = new Star(new Position(0, 0));
		star1.setType(StarType.BLUE);
		Star star2 = new Star(new Position(1, 1),StarType.GREEN);
		System.out.println(star1.toString()+star2.toString());
		System.out.println(StarType.BLUE);
		StarList sList = new StarList();
		sList.add(new Star(new Position(0, 0),StarType.BLUE));
		sList.add(new Star(new Position(1, 1),StarType.RED));
		sList.add(new Star(new Position(2, 2),StarType.YELLOW));
		sList.add(new Star(new Position(3, 3),StarType.GREEN));
		sList.add(new Star(new Position(4, 4),StarType.PURPLE));
		
//		for(int i=0;i<StarService.MAX_ROW_SIZE;i++){
//			for(int j=0;j<StarService.MAX_COLUMN_SIZE;j++){
//				int random = (int)( (Math.random())*5);
//				sList.add(new Star(new Position(i, j),StarType.valueOf(random)));
//			}
//		}
		
		return null;
	}

	public StarList getYMovedStars(StarList clearStars,
			StarList currentStarList) {
		return null;
	}

	/**
	 * 锟斤拷锟斤拷锟斤拷锟斤拷锟角后，伙拷取锟斤拷锟狡讹拷锟斤拷锟斤拷锟斤拷锟叫憋拷(锟斤拷锟斤拷水平锟叫憋拷锟斤拷锟斤拷锟斤拷锟斤拷)<br>
	 * 锟矫癸拷锟杰固讹拷锟节达拷直锟叫憋拷锟斤拷锟斤拷锟斤拷锟斤拷之锟斤拷锟斤拷锟斤拷
	 * 
	 * @param currentStarList
	 *            锟斤拷前锟斤拷锟斤拷锟侥斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟叫憋拷锟斤拷锟窖撅拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷null锟斤拷示锟斤拷
	 * 
	 * @return 锟斤拷锟狡讹拷锟斤拷锟斤拷锟斤拷锟叫憋拷
	 */
	public StarList getXMovedStars(StarList currentStarList) {
		return null;
	}

	/**
	 * 锟叫讹拷锟角否还达拷锟斤拷未锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
	 * 
	 * @param currentStarList
	 *            锟斤拷前锟斤拷锟斤拷锟侥斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟叫憋拷锟斤拷锟窖撅拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷null锟斤拷示锟斤拷
	 * @return true:锟斤拷然锟斤拷未锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷,false:没锟斤拷未锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
	 * 
	 */
	@Override
	public boolean tobeEliminated(StarList currentStarList) {
		return false;
	}

	/**
	 * 锟斤拷取锟睫凤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟叫憋拷
	 * 
	 * @param curretStars
	 *            锟斤拷前锟斤拷锟斤拷锟侥斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟叫憋拷锟斤拷锟窖撅拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷null锟斤拷示锟斤拷
	 * @return 锟睫凤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟叫憋拷
	 * */
	public StarList getAwardStarList(StarList curretStars) {
		return null;
	}

}
