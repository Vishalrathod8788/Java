package My_Pack;


public class LifeCycleThread implements Runnable 
{
	
	Thread t1 = new Thread();

	@Override
	public void run() 
	{
		System.out.println(t1.sleep(2000));
	}

	public static void main(String[] args) 
	{

	}

}
