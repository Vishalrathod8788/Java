package My_Pack;

public class exceptionHendling {

	public static void main(String[] args) 
	{
		int[] ex = new int[5];
		System.out.println("Program Start...");
		String name[] = {null};
		
		try
		{
			System.out.println(name[0]);
			int i = 10/0;
			ex[7] = 100;
			System.out.println("....");
		} 
		catch (NullPointerException err) 
		{
			System.out.println("Null Pointer Exception...");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception Error");
		}
		catch (ArrayIndexOutOfBoundsException er) 
		{
			er.printStackTrace();	// This is Programing Error...
			System.out.println("Array Index Out of Bound Exception");
		}
		System.out.println("Program End...");
	}
}
