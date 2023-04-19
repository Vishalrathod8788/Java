package My_Pack;

public class OneDArrayWithException extends Thread
{
	
	public static void main(String[] args) 
	{
		int j;
		try {
			OneDArrayWithException t1 = new OneDArrayWithException();
			int num[] = {10,20,30,40,50};
				for(int i=0; i<=4; i++)
				{
					System.out.println(num[i]);
				}	
		} catch (Exception e) {
			
		}
		
	}

}
