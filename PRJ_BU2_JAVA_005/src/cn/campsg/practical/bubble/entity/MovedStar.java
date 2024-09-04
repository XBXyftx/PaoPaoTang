package cn.campsg.practical.bubble.entity;

public class MovedStar extends Star {
	private Position movedPosition;
	public  MovedStar(Position position, StarType starType,Position positionMoveTo){
		super(position,starType);
		this.movedPosition=positionMoveTo;
	}
	
	public Position getMovedPosition() {
		return movedPosition;
	}

	public void setMovedPosition(Position positionMoveTo) {
		this.movedPosition = positionMoveTo;
	}

	public static void main (String[] args){
		System.out.println(new MovedStar(new Position(0,0),StarType.RED,new Position(1,1)).toString());
	}
	@Override
	public String toString() {
		return super.toString()+"\nÄ¿±êÎ»ÖÃ£º("+movedPosition.getRow()+','+movedPosition.getColumn()+")";
	}
	
}
