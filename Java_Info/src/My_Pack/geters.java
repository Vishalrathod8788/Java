package My_Pack;

public class geters
{

	private String name;
	private int age;
	
	public geters(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getage()
	{
		return age;
	}
	
	public String setName()
	{
		return name = "VGR";
	}
	public static void main(String[] args) 
	{
		geters obj = new geters("Vishal", 8788);
		System.out.println(obj.getName());
		System.out.println(obj.setName());
		System.out.println(obj.getage());
	}

}
