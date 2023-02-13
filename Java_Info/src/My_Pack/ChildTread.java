package My_Pack;

public class ChildTread extends Thread
{

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread :- " + t.getName());
		
		t.setName("Vishal");
		System.out.println("After Change Name " + t.getName());
		
		System.out.println("Thread Prority " + t.getPriority());
		
	}

}

class MainThread extends Thread
{
	
}
