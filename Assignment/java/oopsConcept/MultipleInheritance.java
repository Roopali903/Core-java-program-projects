
interface CollegeStudent {
	   void enrollment();
	}
	interface CollegeId {
	   void Number();
	}
	class College implements CollegeStudent, CollegeId {
	   public void enrollment() {
	      System.out.println("Enrollment number");
	   }
	   public void Number() {
	      System.out.println("Id number");
	   }
	}
	public class Multiple {
	   public static void main(String args[]) {
	      College c = new College();
	      c.enrollment();
	      c.Number();
	   }
}
