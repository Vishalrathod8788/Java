package My_Pack;

public class toString
{
	int no = 0;
	String name = "VGR";
	void name()
	{
		System.out.println("No "+no + "\nName " + name);
	}
	
	@Override
	public String toString() {
		return "toString [no=" + no + ", name=" + name + "]";
	}

	public static void main(String[] args) 
	{
			toString t1 = new toString();
			t1.name();
			t1.toString();
	}
	
}
