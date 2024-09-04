package cn.campsg.practical.bubble.util;

import cn.campsg.practical.bubble.entity.Position;
import cn.campsg.practical.bubble.entity.Star;
import cn.campsg.practical.bubble.entity.Star.StarType;

/**
 * ������/���ƶ�������ʵ���๤���࣬�ṩ���¹��ܣ�<br>
 * <ul>
 * <li>1. ����ָ���б��е�������-����������������ͬ������������ð�������㷨����</li>
 * <li>2. ��ָ���б��е������ǰ��з��顣</li>
 * <li>3. ��¡һ�������Ƕ���</li>
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
	 * ��¡һ���µ������ǡ�
	 * 
	 * @param star
	 *            ����¡��������
	 * @return �µ������ǣ������ڴ��ַ�������ǣ���
	 */
	/******************** PRJ-BU2-JAVA-004 Task1 ********************/
	public static Star clone(Star star){
		return new Star(new Position(star.getPosition().getRow(),star.getPosition().getColumn()),star.getType());
	}
	public static void main (String[] args){
		Star star = new Star(new Position(5,5),StarType.RED);
		System.out.println(star);
		Star star2 = clone(star);
		System.out.println(star2);
		System.out.println(equals(star,star2));
		System.out.println(equals(star.getPosition(),star2.getPosition()));
	}
	public static boolean equals(Object star1,Object star2 ) {
        if (star1 == star2) { // �����ͬһ������ֱ�ӷ���true
            return true;
        }else{
        	return false;
        }
     }
	
	
	
	
	
	
	
	
	/**************************************************************/
}
