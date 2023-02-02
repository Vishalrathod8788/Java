package My_Pack;

import java.util.StringTokenizer;

public class StringTokenizers {
	public static void main(String[] args) {
//		String str = "vishal;rathod:vercel.app";
		
		String str = "vishal-rathod,vercel.app";
		StringTokenizer tokens = new StringTokenizer(str,  "-,.");
		while ( tokens.hasMoreTokens() )
			System.out.println(tokens.nextToken());
	}
}
