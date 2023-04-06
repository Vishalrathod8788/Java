package My_Pack;

import java.io.*;

public class FileHandlingDemo {

	public static void main(String[] args) 
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("Output.txt");
		}
		catch (Exception e) 
		{
		
		}
	}

}
