package My_Pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutputDemo 
{

	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("/home/vishal/Desktop/fos.txt", true);
		
		String Data = "Hello....!";
		
		fos.write(Data.getBytes());
		
		fos.close();
		
		System.out.println("Data has been written to File 'fos.txt'");
	}

}

