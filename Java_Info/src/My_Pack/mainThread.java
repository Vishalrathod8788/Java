package My_Pack;

public class mainThread {

	public static void main(String[] args) 
	{
		System.out.println("This is Main Thread Demo");
		Thread t = new Thread();
		System.out.println(t.currentThread());
		
		t.setName("main_root_thread");
		System.out.println();
	}

}
