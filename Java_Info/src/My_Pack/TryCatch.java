package My_Pack;

public class TryCatch  extends Thread
{
	public static void main(String[] args) 
	{
		try 
		{
			int a[] = new int[5];
			for(int x=1; x<10; x++)
			{
				System.out.println(a[x] =+ x);
			}
		} 
		catch (Exception e)
		{
			System.out.println("Exception Handling...");
		}
	}
}
