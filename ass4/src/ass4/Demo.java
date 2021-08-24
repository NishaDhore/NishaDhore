package ass4;

public class Demo
{

	
	int id=1111;
	
	static void generateId()
	{
		int id1=1111;
		id1=11+id1;
		System.out.println(id1);
	}
	
	void generateId(int value)
	{
		id=value+id;
		System.out.println(id);
	}
	
	void generateId(char c)
	{
		id=(int)c+id;
		System.out.println(id);
	}
	
}
