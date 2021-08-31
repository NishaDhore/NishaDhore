package Vehicles;

public class Activa implements Vehicle{

	 protected int speed=60;
	 String color="white";
	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		System.out.println("Activa's color="+color);
		System.out.println("Activa's speed="+speed);
	}

}
