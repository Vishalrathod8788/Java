package My_Pack;

public class Construct_overload 
{
	int x, y;
	
	
	public Construct_overload()
	{
		System.out.println("Defalut Constructor ");
	}
	public Construct_overload(int a, int b)
	{
		this.x = a;
		this.y = b;
		System.out.println("Sum Of Two Numbers "+ a+b);
	}
	public static void main(String[] args) 
	{
		new Construct_overload();	
	}

}
