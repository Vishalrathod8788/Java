package My_Pack;

import java.util.Scanner;

public class MultiLeval 
{
	Scanner sc = new Scanner(System.in);
	int x;
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
		
		void input()
		{
			System.out.println("Enter Nuber Of Student : ");
			x = sc.nextInt();
			for(int i=1; i<=x; i++)
			{
				System.out.print("Enter Student Name : ");
				name = sc.nextLine();
				System.out.print("Enter Student Birth Date : ");
				bdate = sc.nextLine();
				System.out.println("Enter Student Gender (boolean Type true is Male And false is Female): ");
				gender = sc.nextBoolean();
				System.out.print("Enter Student Course : ");
				course = sc.nextLine();
				System.out.print("Enter Student Collage : ");
				collage = sc.nextLine();
				System.out.print("Enter Student University : ");
				university = sc.nextLine();
				System.out.print("Enter Student Semester : ");
				sem = sc.nextInt();
				System.out.print("Enter Student Mark 1 : ");
				m1 = sc.nextInt();
				System.out.print("Enter Student Mark 2 : ");
				m2 = sc.nextInt();
				System.out.print("Enter Student Mark 3 : ");
				m3 = sc.nextInt();
				avrg =( m1 + m2 + m3 ) / 3;
			}	
			
		}
		void Display()
		{
			for(int i=1; i<=x; i++)
			{
				System.out.println("Student Name : " + name);
				System.out.println("Student Burth Date : " + bdate);		
				if(gender == true)
				{
					System.out.println("Student Gender Male");
				}
				else
				{
					System.out.println("Student Gender Female");
				}
				System.out.println("Student Course : " + course);
				System.out.println("Student Semester : " + sem);
				System.out.println("Student Univercity : " + university);
				System.out.println("Student Mark 1 : " + m1);
				System.out.println("Student Mark 2 : " + m2);
				System.out.println("Student Mark 3 : " + m3);
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
		MultiLeval m1 = new MultiLeval();
		MultiLeval.Mark obj = m1.new Mark();
		obj.input();
		obj.Display();
	}
}
