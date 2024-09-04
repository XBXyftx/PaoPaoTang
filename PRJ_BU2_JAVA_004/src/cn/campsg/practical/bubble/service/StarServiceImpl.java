package cn.campsg.practical.bubble.service;

import cn.campsg.practical.bubble.entity.Position;
import cn.campsg.practical.bubble.entity.Star;
import cn.campsg.practical.bubble.entity.Star.StarType;
import cn.campsg.practical.bubble.entity.StarList;
import cn.campsg.practical.bubble.util.StarsUtil;

/**
 * 
 * ������ҵ���������࣬����Ϊ�����ṩ���·���<br>
 * 1. ������Ļ�������������<br>
 * 2. �й��ж�<br>
 * 3. �������������ݼ���÷�<br>
 * 4. ����ʣ�������ǵĵ÷ֽ���<br>
 * 
 * @author Frank.Chen
 * @version 2.5
 *
 */
public class StarServiceImpl implements StarService {

	/**
	 * ������Ļ������������ǣ�10 * 10��
	 * 
	 * @return �������б�-��������ʾ
	 */
	@Override
	public StarList createStars() {

		StarList stars = new StarList();
		/******************** PRJ-BU2-JAVA-003 ********************/
		for(int i=0;i<StarService.MAX_ROW_SIZE;i++){
			for(int j=0;j<StarService.MAX_COLUMN_SIZE;j++){
				int random = (int)( (Math.random())*5);
				stars.add(new Star(new Position(i, j),StarType.valueOf(random)));
			}
		}
		/**************************************************************/
		return stars;
	}
	
	/**
	 * �Ը��������ǣ��û�����ģ�Ϊ�����������ҡ�����·������Ѱ����ͬ���͵�������
	 * 
	 * @param base
	 *            ���������ǣ��û�����ģ�
	 * @param sList
	 *            ԭʼ�������б����������е������ǣ�
	 * @param clearStars
	 *            ��������������б�
	 */
	private void lookupByPath(Star base, StarList sList, StarList clearStars) {
		/******************** PRJ-BU2-JAVA-004 Task2 ********************/
		int baseRow = base.getPosition().getRow();
		int baseColumn = base.getPosition().getColumn();
		if(baseColumn>0){//����
			if(sList.lookup(baseRow, baseColumn-1)!=null){
				
				if(!clearStars.existed(sList.lookup(baseRow, baseColumn-1))){
					
					if(sList.lookup(baseRow, baseColumn-1).getType()==base.getType()){
						
						clearStars.add(StarsUtil.clone(sList.lookup(baseRow, baseColumn-1)));
						
						lookupByPath(sList.lookup(baseRow, baseColumn-1),sList,clearStars);
					}
				}
			}
		}
		/**************************************************************/

		/******************** PRJ-BU2-JAVA-004 Task3 ********************/
		if(baseColumn<10){//����
			if(sList.lookup(baseRow, baseColumn+1)!=null){
				
				if(!clearStars.existed(sList.lookup(baseRow, baseColumn+1))){
					
					if(sList.lookup(baseRow, baseColumn+1).getType()==base.getType()){
						
						clearStars.add(StarsUtil.clone(sList.lookup(baseRow, baseColumn+1)));
						
						lookupByPath(sList.lookup(baseRow, baseColumn+1),sList,clearStars);
					}
				}
			}
		}
	
		/**************************************************************/

		/******************** PRJ-BU2-JAVA-004 Task4 ********************/
		if(baseRow>0){//����
			if(sList.lookup(baseRow-1, baseColumn)!=null){
				
				if(!clearStars.existed(sList.lookup(baseRow-1, baseColumn))){
					
					if(sList.lookup(baseRow-1, baseColumn).getType()==base.getType()){
						
						clearStars.add(StarsUtil.clone(sList.lookup(baseRow-1, baseColumn)));
						
						lookupByPath(sList.lookup(baseRow-1, baseColumn),sList,clearStars);
					}
				}
			}
		}

		/**************************************************************/

		/******************** PRJ-BU2-JAVA-004 Task5 ********************/
		if(baseRow<10){//����
			if(sList.lookup(baseRow+1, baseColumn)!=null){
				
				if(!clearStars.existed(sList.lookup(baseRow+1, baseColumn))){
					
					if(sList.lookup(baseRow+1, baseColumn).getType()==base.getType()){
						
						clearStars.add(StarsUtil.clone(sList.lookup(baseRow+1, baseColumn)));
						
						lookupByPath(sList.lookup(baseRow+1, baseColumn),sList,clearStars);
					}
				}
			}
		}
		
		/**************************************************************/

		// �����ĸ��ж϶����������ʾ���ܶ�û���������ˣ���ô�����ݹ鷽����
	}

	/**
	 * �û���������ǣ���ȡ���������������������б�
	 * 
	 * @param base
	 *            ���û������������
	 * @param sList
	 *            ��ǰ���������ݵ��б�
	 * @return ��Ҫ�����������
	 */
	@Override
	public StarList tobeClearedStars(Star base, StarList mCurrent) {
		/******************** PRJ-BU2-JAVA-004 Task2 ********************/
		StarList clearStars = new StarList();
		clearStars.add(base);
		lookupByPath(base,mCurrent,clearStars);
		if(clearStars.size()==1){
			clearStars.clear();
		}
		return clearStars;
		/**************************************************************/
	}

	public StarList getVMovedStars(StarList clearStars,
			StarList currentStarList) {
		return null;
	}

	/**
	 * ���������Ǻ󣬻�ȡ���ƶ��������б�(����ˮƽ�б��������)<br>
	 * �ù��̶ܹ��ڴ�ֱ�б��������֮������
	 * 
	 * @param currentStarList
	 *            ��ǰ�����Ľ����������б��Ѿ�����������������null��ʾ��
	 * 
	 * @return ���ƶ��������б�
	 */
	public StarList getHMovedStars(StarList currentStarList) {
		return null;
	}

	/**
	 * �ж��Ƿ񻹴���δ������������
	 * 
	 * @param currentStarList
	 *            ��ǰ�����Ľ����������б��Ѿ�����������������null��ʾ��
	 * @return true:��Ȼ��δ������������,false:û��δ������������
	 * 
	 */
	@Override
	public boolean tobeEliminated(StarList currentStarList) {
		return false;
	}

	/**
	 * ��ȡ�޷������������б�
	 * 
	 * @param curretStars
	 *            ��ǰ�����Ľ����������б��Ѿ�����������������null��ʾ��
	 * @return �޷������������б�
	 * */
	public StarList getAwardStarList(StarList curretStars) {
		return null;
	}
}
