
public class Leave
{
	private int Lid;
	public String Ltype;
	protected String Ldate;
	
	public Leave()
	{
		this.Lid=Lid;
		this.Ltype=Ltype;
		this.Ldate=Ldate;
	}
	
	private Leave(String ltype, String ldate) {
		super();
		Ltype = ltype;
		Ldate = ldate;
	}

	protected Leave(int lid, String ltype, String ldate) {
		super();
		Lid = lid;
		Ltype = ltype;
		Ldate = ldate;
	}

	public int getLid() {
		return Lid;
	}

	public void setLid(int lid) {
		Lid = lid;
	}

	public String getLtype() {
		return Ltype;
	}

	public void setLtype(String ltype) {
		Ltype = ltype;
	}

	public String getLdate() {
		return Ldate;
	}

	public void setLdate(String ldate) {
		Ldate = ldate;
	}

	@Override
	public String toString() {
		return "Leave [Lid=" + Lid + ", Ltype=" + Ltype + ", Ldate=" + Ldate + "]";
	}
	
	
	
	//3 methods
	
	void m1()
	{
		System.out.println("method-m1()");
	}
	private void m2()
	{
		System.out.println("method-m2()");
	}
	public void m3()
	{
		System.out.println("method-m3()");
	}
	
	
	
}
