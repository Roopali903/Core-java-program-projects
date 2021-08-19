public class Runnable
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable()
		{
			public void run()
			{
				for(int i=1;i<=5;i++) {
					System.out.println("java");
					try {
						Thread.sleep(500);
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
			}
			
		};
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("junit");
					try {
						Thread.sleep(500);
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
			}
		};
			Thread t = new Thread();
			t.start();
			Thread t1 = new Thread();
			t1.start();
	}

}
