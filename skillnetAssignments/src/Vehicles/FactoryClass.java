package Vehicles;

import set2.Activa2g;
import set2.Activa3g;

public class FactoryClass {

	public Vehicle getInstance(String str)
	{
		if(str.equals("2"))
			return new Activa();
		else if(str.equals("2g"))
			return new Activa2g();
		else if(str.equals("3g"))
			return new Activa3g();
		else if(str.equals("3"))
			return new AutoRikshaw();
		else if(str.equals("4"))
			return new Maruti();
		else
			return null;
	}
}
