class Mul extends Thread
{
	public void run()
	{
		for(int i=0;i<5; i++) {
			System.out.println("Exception handling work");
			try {
				Thread.sleep(1000);
			}catch(Exception e)
				{
				System.out.println(e);
				}
		}
	}
}
class Hand extends Thread
{
	public void run()
	{
		for(int i=0;i<5; i++) {
			System.out.println("Multithreading");
			try {
			Thread.sleep(1000);
		}catch(Exception e)
			{
			System.out.println(e);
			}
	}
}
}


public class Program {

	public static void main(String[] args) {
		Mul ob = new Mul();
		ob.start();
		Hand h = new Hand();
		h.start();

	}

}
