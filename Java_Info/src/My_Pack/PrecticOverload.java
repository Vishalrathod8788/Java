package My_Pack;

public class PrecticOverload 
{
	int a,b;
	
	int sum(int a, int b)
	{
		System.out.println("1");
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		over1 obj = new over1();
		
		System.out.println(obj.sum(3, 5));
	}
}

class over1 extends PrecticOverload
{
	int sum(int a, int b)
	{
		System.out.println("2");
		return a+b;
	}
	
}
