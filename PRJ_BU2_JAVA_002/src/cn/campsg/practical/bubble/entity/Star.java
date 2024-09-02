package cn.campsg.practical.bubble.entity;

public class Star {
	private Position position;
	private StarType type;

	enum StarType {
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

	}

	public Star(Position position,StarType type) {
		// TODO Auto-generated constructor stub
		this.position = position;
		this.type = type;

	}

	public void setPosition(Position position) {
		this.position = position;

	}

	public Object getPosition() {
		return null;
	}

	public void setType(StarType type) {
		this.type = type;
	}
	public Object getType() {
		return null;
	}

}


