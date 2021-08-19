/* Hierarical interface */
interface Add {
	   void into();
	}
	class Maths implements Add  {
	   public void into() {
	      System.out.println("Addition of two number");
	   }
	}
	   class maths2 implements Add{
		   public void into() {
		   System.out.println("enter value");
	   }
	  
	}
	public class Multiple {
	   public static void main(String args[]) {
	      Add a = new maths2();
	      Add c = new Maths();
	      a.into();
	      c.into();
	      
	   }
	}
