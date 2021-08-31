package Vehicles;

public class Maruti implements Vehicle {

	int speed=100;
	String color="black";
	
	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		System.out.println("maruti's speed="+speed);
		System.out.println("maruti's color="+color);
	}

}
