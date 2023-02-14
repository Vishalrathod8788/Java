package My_Pack;

public class ChildTread extends Thread
{

	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread :- " + t.getName());
		t.setName("Vishal");
		System.out.println("After Change Name " + t.getName());
	}

}

class MainThread extends Thread
{
	Thread t = Thread.currentThread();
	public MainThread() {
		System.out.println("Hello...");
	}
}
