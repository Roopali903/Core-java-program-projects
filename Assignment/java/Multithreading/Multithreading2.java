class jar extends Thread
	{
		public void run()
		{
			String[] a = {"Dog","cat","Lion","Tiger","Cow"};
			{
				for(int i=0 ;i<a.length;i++) {
				System.out.println(" "+a[i]);
				try {
					Thread.sleep(1000);
				}
				catch(Exception e)
					{
					System.out.println(e);
					}
			}
			}
		}
	}
	class cattle extends Thread
	{
		public void run()
		{
			for(int j=0;j<4; j++) {
				System.out.println("Animal");
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
			jar ob = new jar();
			ob.start();
			cattle h = new cattle();
			h.start();

		}

	}


//}
