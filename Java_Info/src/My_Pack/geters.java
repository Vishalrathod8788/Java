package My_Pack;

public class geters
{

	private String name;
	private int age;
	private String city;
	public geters(String name, int age)
	{
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String getName()
	{
		return name;
	}
		
	public String setName()
	{
		return name = "VGR";
	}
	
	public int getage()
	{
		return age;
	}
	
	public int setage()
	{
		return age = 11;
	}
	public static void main(String[] args) 
	{
		geters obj = new geters("Vishal", 8788);
		System.out.println(obj.getName());
		System.out.println(obj.setName());
		System.out.println(obj.getage());
		System.out.println(obj.setage());
	}

}



