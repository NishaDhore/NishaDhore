package set1;

import java.util.Scanner;

import Vehicles.FactoryClass;
import Vehicles.Vehicle;

public class MainC {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryClass fc=new FactoryClass();
		Vehicle ob = fc.getInstance("3g");
		ob.showdetails();
	}

}
