package My_Pack;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "VGR";
		StringBuffer str = new StringBuffer("Hyyy");
		System.out.println(str.charAt(3));
		System.out.println(str.capacity());
		System.out.println(str.length());
		System.out.println(str.codePointAt(2));
		System.out.println(str.codePointBefore(2));
		System.out.println(str.codePointCount(0, str.length()));
		System.out.println(str.isEmpty());
		System.out.println(str.equals(name));
		System.out.println(str.substring(3));
		System.out.println(str.hashCode());
		System.out.println(str.lastIndexOf(name, 2));
	}

}
