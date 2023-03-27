package My_Pack;

public class Multiplay
{	
	public void Multiplay(int a, int b)
	{
		Sum obj = new Sum();
		obj.a = a;
		obj.b = b;
		System.out.println("Multiplay Of 2 Numbers " + (a*b));
	}
	
	
	public static void main(String[] args)
	{
		Multiplay m = new Multiplay();
		m.Multiplay(2, 2);
	}

}
