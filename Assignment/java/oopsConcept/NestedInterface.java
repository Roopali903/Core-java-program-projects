package newproject;
interface A {
void info();

interface B{
	void info_one();
}
}
class Nested implements A {
	public void info_one() {
		System.out.println("Nested interface A");
	}
	public void info() {
		System.out.println("Nested interface B");
	}
}

public class NestedJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested N = new Nested();
		N.info_one();
		N.info();

	}

}
