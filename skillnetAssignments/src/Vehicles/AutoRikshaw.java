package Vehicles;

public class AutoRikshaw implements Vehicle{

	int speed2=40;
	String color="yellow";
	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		System.out.println("Auto's color="+color);
		System.out.println("Auto's speed="+speed2);
	}

}
