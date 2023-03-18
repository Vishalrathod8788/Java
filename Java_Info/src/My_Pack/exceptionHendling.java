package My_Pack;

public class exceptionHendling {

	public static void main(String[] args) 
	{
		int[] ex = new int[5];
		System.out.println("Program Start...");
		try
		{
			ex[7] = 10;
		} 
		catch (ArrayIndexOutOfBoundsException er) 
		{
//			er.printStackTrace();
			System.out.println("Array Index Out of Bound Exception");
		}
	}
}
