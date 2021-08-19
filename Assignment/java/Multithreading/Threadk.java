class k {
		int count = 0;
		public void counter() {
			count++;
		}
	}
	public class B {
		public static void main(String[] s) throws Exception {
			k a = new k();
			Thread t = new Thread (new Runnable() 
			{
				public void run() {
					for(int i=1;i<=1000 ;i++) {
						a.counter();
					}
				}
				
			});
			t.start();
			t.join();
			System.out.println("value of count"+a.count);
		}
		

}
