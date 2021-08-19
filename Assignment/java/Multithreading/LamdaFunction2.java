public class lamdaFunction {
	public static void main(String s[]) {
		Thread t = new Thread(()-> {
				
			
			{
					for(int n =1 ; n<=10 ;n++)//printing 5 table
					{
					System.out.println("java");
				    }
				
					
						try {
							Thread.sleep(500);
						}
						catch(Exception e) {
							System.out.println(e);
						}
					}
				});
		t.start();
		Thread t1 = new Thread(() ->
		{
				for(int i = 1 ; i<=5 ; i++) {
					System.out.println("Hello");
					{
						try {
							Thread.sleep(500);
						}
						catch(Exception e) {
							System.out.println(e);
						}
						
			
					}
				}
		}
		);
		t1.start();
	}
}
	

