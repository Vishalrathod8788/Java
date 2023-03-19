package My_Pack;

public class exceptionHendling {

	public static void main(String[] args) 
	{
		int[] ex = new int[5];
		System.out.println("Program Start...");
		int i = 10/0;
		
		try
		{
			
			ex[7] = 10;
		} 
		catch (ArrayIndexOutOfBoundsException er) 
		{
			er.printStackTrace();	// This is Programing Error...
			System.out.println("Array Index Out of Bound Exception");
		}
		System.out.println("Program End...");
	}
}
