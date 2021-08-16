public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello java";
		System.out.println("my string: " +s);
		int index1 = s.codePointAt(0);
		int index2 = s.codePointAt(9);
		int index3 = s.codePointAt(2);
		int index4 = s.codePointAt(3);
		int index5 = s.codePointAt(1);
System.out.println("The unicode at position 0 is "+index1);
System.out.println("The unicode at position 9 is "+index2);
System.out.println("The unicode at position 2 is "+index3);
System.out.println("The unicode at position 3 is "+index4);
System.out.println("The unicode at position 1 is "+index5);

	}

}