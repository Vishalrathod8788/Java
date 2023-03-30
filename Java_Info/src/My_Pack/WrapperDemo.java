package My_Pack;

import java.util.Vector;

public class WrapperDemo 
{

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.addElement(new Integer(5));
		vector.addElement(new Float(10.1111));
		
		System.out.println("1 : " + vector.get(0));
		System.out.println("1 : " + vector.get(1));
	}
}
