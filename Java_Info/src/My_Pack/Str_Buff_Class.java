package My_Pack;

public class Str_Buff_Class {

	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Vishal");
		String name = "VGR";
		System.out.println(str.charAt(3));
		System.out.println(str.insert(6, " Rathod"));
		System.out.println(str.replace(0, 6, "VGR"));
		System.out.println(str.isEmpty());
		System.out.println(str.equals(name));
		System.out.println(str.reverse());
		
	}

}
