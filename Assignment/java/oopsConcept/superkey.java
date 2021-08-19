class clg{
	String name = "Delhi university";
}
class Student extends clg {
	String name = "shiv";
	void printName() {
		System.out.println(name);
		System.out.println(super.name);
		
			
		}
	}
public class superkey 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.printName();
		

	}

}
