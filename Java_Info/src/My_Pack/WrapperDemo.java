package My_Pack;

import java.util.Vector;

public class WrapperDemo {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.addElement(new Integer(5));
		
		System.out.println("1 : " + vector.get(0));
	}
}
