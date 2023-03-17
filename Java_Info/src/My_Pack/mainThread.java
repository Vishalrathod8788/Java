package My_Pack;

public class mainThread {

	public static void main(String[] args) 
	{
		System.out.println("This is Main Thread Demo");
		Thread t = new Thread();
		System.out.println(t.currentThread());
		
		t.setName("main_root_thread");
		System.out.println(t.getName());
		
		System.out.println(t.NORM_PRIORITY);
		System.out.println(t.MAX_PRIORITY);
		System.out.println(t.MIN_PRIORITY);
		t.setPriority(111);
		System.out.println(t.getPriority());
		System.out.println(t.getId());
		t.getStackTrace();
		t.isAlive();
		
		System.out.println();
		
	}

}