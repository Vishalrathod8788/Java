package My_Pack;

abstract class Bike
{
	public abstract void run();

}

public class runTIme_Polimorephisam extends Bike
{

	
	public static void main(String[] args) 
	{
		runTIme_Polimorephisam r1 = new runTIme_Polimorephisam();
		r1.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runn................");
	}

}
