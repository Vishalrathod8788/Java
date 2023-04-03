package My_Pack;

import java.util.Vector;

public class Vector_Class {

	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		
		v1.addElement(new Integer(222));
		
		v1.insertElementAt("Hello Friends", 1);
		v1.removeElement("Hello Friends");
		v1.clear();
		System.out.println("Vector Size : " + v1.size());
		
		for(int i=0; i<v1.size(); i++)
		{
			System.out.println(i +" : "+v1.get(i));	 
		}
		
	}
}
