package My_Pack;

public class MultiDArray 
{
	public static void main(String[] args) 
	{
		int numbers[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		
		for(int i=0; i<=numbers.length; i++)
		{
			for(int j=0; j<=numbers.length; j++)
			{
				System.out.println("No 1 " + numbers[i][j]);
			}
		}
	}
}