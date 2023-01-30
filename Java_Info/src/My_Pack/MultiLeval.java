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
			System.out.println("Enter Nuber Of Student : ");
			int x = sc.nextInt();
			for(int i=1; i<=x; i++)
			{
				System.out.println("Enter Student Name : ");
				name = sc.nextLine();
				System.out.println("Enter Student Birth Date : ");
				bdate = sc.nextLine();
				System.out.println("Enter Student Gender : ");
				gender = sc.nextBoolean();
				System.out.println("Enter Student Course : ");
				course = sc.nextLine();
				System.out.println("Enter Student Collage : ");
				collage = sc.nextLine();
				System.out.println("Enter Student University : ");
				university = sc.nextLine();
				System.out.println("Enter Student Semester : ");
				sem = sc.nextInt();
				System.out.println("Enter Student Mark 1 : ");
				m1 = sc.nextInt();
				System.out.println("Enter Student Mark 2 : ");
				m2 = sc.nextInt();
				System.out.println("Enter Student Mark 3 : ");
				m3 = sc.nextInt();
				avrg =( m1 + m2 + m3 ) / 3;
				if(avrg <= 70 && 79 >= avrg)
				{
					System.out.println(name + "Achive C Grade ");
				}
				else if(avrg <= 80 && 89 >= avrg)
				{
					System.out.println(name + "Achive B Grade ");
				}
				else if(avrg <= 90 && 100 >= avrg)
				{
					System.out.println(name + "Achive A Grade ");
				}
				System.out.println(name + "Avereges is "+ avrg);
			}
		}
	}
	
	public static void main(String[] args)
	{
		
	}
}
