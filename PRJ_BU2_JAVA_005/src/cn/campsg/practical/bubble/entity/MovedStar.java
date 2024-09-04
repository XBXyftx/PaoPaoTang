package cn.campsg.practical.bubble.entity;

public class MovedStar extends Star {
	private Position positionMoveTo;
	public  MovedStar(Position position, StarType starType,Position positionMoveTo){
		super(position,starType);
		this.positionMoveTo=positionMoveTo;
	}
	
	public Position getPositionMoveTo() {
		return positionMoveTo;
	}

	public void setPositionMoveTo(Position positionMoveTo) {
		this.positionMoveTo = positionMoveTo;
	}

	public static void main (String[] args){
		System.out.println(new MovedStar(new Position(0,0),StarType.RED,new Position(1,1)).toString());
	}
	@Override
	public String toString() {
		return "原位置：("+super.getPosition().getRow()+","+super.getPosition().getColumn()+")"+'\n'+"目标位置：("+positionMoveTo.getRow()+','+positionMoveTo.getColumn()+")"+'\n'+super.getType();
	}
	
}
