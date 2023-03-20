package My_Pack;


public class LifeCycleThread implements Runnable 
{
	
	Thread t1 = new Thread();

	@Override
	public void run() 
	{
		try 
		{
			t1.sleep(200);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{

	}

}
