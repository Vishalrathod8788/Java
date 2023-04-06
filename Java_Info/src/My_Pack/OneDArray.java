package My_Pack;

public class OneDArray extends Thread
{
	
	public static void main(String[] args) 
	{
		OneDArray t1 = new OneDArray();
		int num[] = {10,20,30,40,50};
		try
		{
			
		}
		catch (Exception e) 
		{
		
		}
		for(int i=0; i<=4; i++)
		{
			System.out.println(num[i]);
			t1.sleep(i);
		}
	}

}
