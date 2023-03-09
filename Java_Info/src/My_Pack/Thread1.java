package My_Pack;

public class Thread1 extends Thread
{
	
	public void run()
	{
		System.out.println("New Thread...");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread1 t = new Thread1();
		t.start();
		System.out.println("Thread...");
	}
}