package My_Pack;

import java.util.Scanner;

public class MultiLeval 
{
	Scanner sc = new Scanner(System.in);
	class person 
	{
		String name, bdate;
		boolean gender;
		public person()
		{
			System.out.println("This Is Person Class");	
		}
	}
	
	class StudentDetail extends person
	{
		String course, collage, university;
		public StudentDetail()
		{
			System.out.println("This Is Univercity Class");
		}
	}
	
	class Mark extends StudentDetail
	{
		char Grade;
		int sem, m1, m2, m3;
		float avrg;
		
		void Display()
		{
			
		}
	}
	
	public static void main(String[] args)
	{
		
	}
}
