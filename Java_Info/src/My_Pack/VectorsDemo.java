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
		
		v1.insertElementAt("Hello Friends", 3);
		
		VectorStud p1 = new VectorStud(1, "VGR");
		VectorStud p2 = new VectorStud(2, "Vishal");
		v1.addElement(p1);
		v1.addElement(p2);
		
//		System.out.println(v1);  //The output of this will be [ As many stores as there are in the list will come ]
		
		
		for(int i=0; i<v1.size(); i++)
		{
			System.out.println(i +" : "+v1.get(i));	 //The output of this will be print values one by one
		}
		
//		System.out.println("1 : "+v1.get(0));
//		System.out.println("2 : "+v1.get(1));
//		System.out.println("3 : "+v1.get(2));
//		System.out.println("4 : "+v1.get(3));
//		System.out.println("5 : "+v1.get(4));
//		System.out.println("6 : "+v1.get(5));
//		System.out.println("7 : "+v1.get(6));
//		System.out.println("8 : "+v1.get(7));
//		System.out.println("9 : "+v1.get(8));
//		System.out.println("10 : "+v1.get(9));

	}

}
