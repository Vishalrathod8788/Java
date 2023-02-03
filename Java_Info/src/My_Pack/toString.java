package My_Pack;


public class toString
{
	int no = 0;
	String name = "VGR";
	public toString(int no, String name)
	{
		this.no = no;
		this.name = name;
	}

	void name()
	{
		this.name = name;
		this.no = no;
		System.out.println("No " + no +"\nName " + name);
	}
	@Override
	public String toString() {
		return "toString [no=" + no + ", name=" + name + "]";
	}

	public static void main(String[] args) 
	{
			toString t1 = new toString(1, "VGR");
			toString t2 = new toString(2, "Vishal");
			System.out.println(t1.toString());
	}
	
}
