package ass12;

public class Typist extends Staff {
	private int speed;

	public Typist(int code, String name, int speed) {
		super(code, name);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Typist(int code, String name) {
		super(code, name);
		// TODO Auto-generated constructor stub
	}
	
	

}
