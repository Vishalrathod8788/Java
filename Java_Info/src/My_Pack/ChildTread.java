package My_Pack;

public class ChildTread extends Thread
{

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread :- "+ t.getName());
	}

}

class MainThread extends Thread
{
	
}
