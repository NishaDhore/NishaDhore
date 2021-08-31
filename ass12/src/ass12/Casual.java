package ass12;

public class Casual extends Typist {

	

	private double DailyWages;

	public Casual(int code, String name, int speed, double dailyWages)
	{
		super(code, name, speed);
		DailyWages = dailyWages;
	}

	public double getDailyWages() {
		return DailyWages;
	}

	public void setDailyWages(double dailyWages) {
		DailyWages = dailyWages;
	}

	
}
