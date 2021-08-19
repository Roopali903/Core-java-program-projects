public class join {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			Thread t = new Thread(() -> {
				for(int i=1;i<=15;i++) {
					System.out.println(i*i);
					try {
						Thread.sleep(500);
					}
						catch(Exception e) {
							System.out.println(e);
						}
					}
				
			});
			Thread t1 = new Thread(() -> {
				for(int i=1;i<=10;i++) {
					System.out.println("SQuare of number");
					try {
						Thread.sleep(500);
					}
						catch(Exception e) {
							System.out.println(e);
						}
					}
				
			}
			);
			t.start();
			try {
				Thread.sleep(200);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			t1.start();
			t.join();
			t1.join();
			System.out.println(t.isAlive());
			System.out.println(" By using Thread ");
		}
	}
			



