package cn.campsg.practical.bubble.entity;
public class Star {
	private Position position;
	private StarType type;

	public enum StarType {
		BLUE(0),
		GREEN(1),
		YELLOW(2),
		RED(3),
		PURPLE(4);
		private int value;
		private StarType(int value) {
			this.value = value;
		}

		public int value() {
			return value;
		}
		public static StarType valueOf(int value){
			switch (value) {
				case 0:
					return StarType.BLUE;
				case 1:
					return StarType.GREEN;
				case 2:
					return StarType.YELLOW;
				case 3:
					return StarType.RED;
				case 4:
					return StarType.PURPLE;
				default:
					throw new AssertionError();
			}
		

	}

	public Star() {
		this(new Position(), StarType.BLUE);
	}
	
	public Star(Position position) {
		this(position, StarType.BLUE);
	}

	public Star(Position position,StarType type) {
		// TODO Auto-generated constructor stub
		this.position = position;
		this.type = type;

	}

	public void setPosition(Position position) {
		this.position = position;

	}

	public Position getPosition() {
		return position;
	}

	public void setType(StarType type) {
		this.type = type;
	}
	public StarType getType() {
		return type;
	}

	
	}

}


