package My_Pack;

public class Static_variable_method 
{
	static int x = 10;
	static int y = 20;
	
	public static int sum(int a, int b)
	{
		x = a;
		y = b;
		System.out.println("Sum Of " + (x + y));
		return x+y;
	}

	public static void main(String[] args) 
	{
		sum(30, 40);
		System.out.println(x);
		System.out.println(y);
		System.out.println("Total"+ (x + y));
	}

}
