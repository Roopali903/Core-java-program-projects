package inheritance;
interface Maths {
	   void into();
	}
	interface Multiply {
	   void Number();
	}
	class College implements Maths, Multiply {
	   public void into() {
	      System.out.println("Multiplication of two number");
	   }
	   public void Number() {
		   System.out.println("Number 2*3");
	      System.out.println(3*4);
	   }
	}
	public class Multiple {
	   public static void main(String args[]) {
	      College c = new College();
	      c.into();
	      c.Number();
	   }
}
