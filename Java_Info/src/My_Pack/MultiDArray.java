package My_Pack;

public class MultiDArray {

	public static void main(String[] args) 
	{
		int number[][] = {{10,20,30,40,50},{60,70,80,90,100}};
		
		for(int i=0; i<=number.length; i++)
		{
			for(int j=0; j<=number.length; j++)
			{
				System.out.println(number[i][j]);
			}
		}
	}

}
