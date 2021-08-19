interface Printable{
	void introduction();
}
interface Showable extends Printable {
	void show();
}

	class Test implements Showable {
	   public void introduction() {
	      System.out.println("My name is Reema");
	   }
	
	
	public void show() 
	{
		System.out.println("HI, What's your name?");
	}
	}
	
	   
	public class Multiple {
	   public static void main(String args[]) {
		   Test s = new Test();
	      s.show();
	      s.introduction();
	      
	   }
	}

