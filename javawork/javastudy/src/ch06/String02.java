package ch06;

public class String02 {

	public static void main(String[] args) {
		String a = " c#  ";
		String b = new String(" ,c++ ");
		
		a = a.concat(b);
		System.out.println(a);
		
		System.out.println(a.trim());
		
		a = a.replace("c#", "java");
		System.out.println(a);
		
		String[] s = a.split(",");
		for (int i=0; i<s.length; i++)
			System.out.println("분리된 문자열"+i + ":" + s[i]);
	}

}
