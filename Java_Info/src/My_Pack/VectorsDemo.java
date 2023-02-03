package My_Pack;

import java.util.Vector;
public class VectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		
		String str = "This String ";
		v1.addElement(str);
		
		v1.addElement(new Integer(222));
		v1.addElement(new Float (200.000000));
		v1.addElement(new String("VGR"));
		v1.addElement(new Double(12.2222222));
		v1.addElement(new Character('A'));
		v1.addElement(new Long(1212121));
		v1.addElement(new Short((short)324));
		
		System.out.println(v1.get(0));
		System.out.println(v1.get(1));
		System.out.println(v1.get(2));
		System.out.println(v1.get(3));
		System.out.println(v1.get(4));
		System.out.println(v1.get(5));
		System.out.println(v1.get(6));
		System.out.println(v1.get(7));
//		System.out.println(v1.get(8));
//		System.out.println(v1.get(9));
	}

}
