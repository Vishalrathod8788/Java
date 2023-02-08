package My_Pack;

public class MethodOverriding
{
//	int a;
//	double c;
//	public void Overriding(int a, double c)
//	{
//		System.out.println("Method 1 : " + (a+c));
//	}
	public void Overriding()
	{
		System.out.println("Method 1 ");
	}
	
	public static void main(String[] args) 
	{
		over m = new over();
		m.Overriding();
	}
}
class over extends MethodOverriding
{
	public void Overriding()
	{
		System.out.println("Method Overrided");
	}
}

