package My_Pack;

public class MethodOverriding
{
	int a;
	double c;
	public void Overriding(int a, double c)
	{
		System.out.println("Method 1 : " + (a+c));
	}
	public void Overriding(double c, int a)
	{
		System.out.println("Method 2 : " + (a+c));
	}
	
	public static void main(String[] args) 
	{
		MethodOverriding m = new MethodOverriding();
		m.Overriding(2, 2.2222);
		m.Overriding(2.2222, 2);
		
	}
}
