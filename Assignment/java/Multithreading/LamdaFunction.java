package Multithreading;

public class lamdaFunction {
	public static void main(String s[]) {
		Thread t = new Thread(()-> {
				
			
			{
					for(int n =1 ; n<=10 ;n++)//printing 5 table
					{
					System.out.println(n*5);
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
				for(int i = 1 ; i<=100 ; i++) {
					System.out.println(i*i);
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
	

