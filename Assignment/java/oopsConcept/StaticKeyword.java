public class StaticKeyword {

	public static void main(String[] args) {
		
System.out.println("A");
f1();
System.out.println("B");
}
	public static void f1() {
		System.out.println("c");
		f3();
		System.out.println("e");
		
	}
	public static void f3() {
		//System.out.println("c");
		
		System.out.println("e");
		
}
}

