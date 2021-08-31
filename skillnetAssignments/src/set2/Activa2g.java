package set2;

import Vehicles.Activa;

public class Activa2g extends Activa
{
	int speed=50;
	private int price=52000;
	 
	 public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price!=0)
			this.price = price;
	}

	 public void showdetails()
	 {	
		 
		 System.out.println("Activa's speed="+super.speed);
		 System.out.println("activa2g speed="+speed);
		 System.out.println("activa2g price="+getPrice());
	 }
}
