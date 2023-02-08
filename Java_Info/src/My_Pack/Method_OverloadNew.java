package My_Pack;

public class Method_OverloadNew {
	
	int a;
	double b;
	void Method(int x, double y)
	{
		this.a = x;
		this.b = y;
		System.out.println("Sum Of Two Numbers : " + (a+b));
	}

	void Method(double y, int x)
	{
		this.a = x;
		this.b = y;
		System.out.println("Sum Of Two Numbers : " + (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
