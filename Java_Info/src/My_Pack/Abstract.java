package My_Pack;


abstract class A12
{
	abstract void name();
	public void show()
	{
		System.out.println("This is Abstract Method ");
	}
}

public class Abstract extends A12
{

	@Override
	void name() 
	{
		// TODO Auto-generated method stub
		System.out.println("VGR");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Abstract a = new Abstract();
		a.show();
		a.name();
	}

}
