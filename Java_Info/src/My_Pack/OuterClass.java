package My_Pack;

public class OuterClass 
{
	private int x = 10;
	
	class inner
	{
		void innerMain()
		{
			System.out.println("X variable value " + x);
		}
	}

	void nest()
	{
		System.out.println("This is Nest Method");
	}
	
	public static void main(String[] args) 
	{
		OuterClass A = new OuterClass();
		A.nest();
		OuterClass.inner B = A.new inner();
		B.innerMain();
	}
}

class X
{
	static void nest()
	{
		//System.out.println("nest Class Can be access X Variable " + x); This Variable not Access
	}
}