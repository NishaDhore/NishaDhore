package set2;

public class Activa3g extends Activa2g {

	int speed=60;
	int price=52500;
	 void showprice()
	 {
		 
		 System.out.println("activa3g price="+getPrice());
	}
	 
	 public void showdetails()
	 {
		 showprice();
		 System.out.println("activa3g speed="+speed);
	 }
	
}
