public class c {
	public class Runn {
		public static void main(String[] args)  {
		Runnable r = ()->
		{
			for(int i =1 ; i<=5 ;i++)
			{
				System.out.println(i);
				try {
					Thread.sleep(500);
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
			}
		
		};   
		Runnable r1=()->
		         {
			for(int i =5 ; i<=10 ;i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		
		};  
	Thread t = new Thread(r);
	t.start();
	Thread t1 = new Thread(r1);
	t1.start();
	}
	}

		



}
