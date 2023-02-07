package My_Pack;

public class Sum 
{
	int a, b;
	public void Sum(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("Sum Of A and B :"+ (a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum a = new Sum();
		a.Sum(2, 3);
	}

}
