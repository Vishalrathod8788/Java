package My_Pack;

public class ChildTread extends Thread
{

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread :- " + t.getName());
		System.out.println("Thread Prority " + t.getPriority());
		t.setName("Vishal");
		System.out.println("After Change Name " + t.getName());
		
		
		
	}

}

class MainThread extends Thread
{
	
}
