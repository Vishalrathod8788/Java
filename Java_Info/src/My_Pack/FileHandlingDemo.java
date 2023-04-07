package My_Pack;

import java.io.*;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			System.out.println("Program Start...");
			in = new FileInputStream("/home/vishal/Desktop/input.txt");
			out = new FileOutputStream("Output.txt");
			int c;
			while((c = in.read()) != -1)
			{
				out.write(c);
			}	
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			if(in!=null)
			{
				in.close();
			}
			
			if(out != null)
			{
				out.close();
			}
		}
		
	}

}
