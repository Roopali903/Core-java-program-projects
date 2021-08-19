public class lamdaFunction {
	public static void main(String s[]) {
		Thread t = new Thread(()-> {
				
			
			{
				int[] arr = new int[10];
				int[] age = {12, 4, 5, 2, 5};
				{
				   // access each array elements
				   System.out.println("Accessing Elements of Array:");
				   System.out.println("First Element: " + age[0]);
				   System.out.println("Second Element: " + age[1]);
				   System.out.println("Third Element: " + age[2]);
				   System.out.println("Fourth Element: " + age[3]);
				   System.out.println("Fifth Element: " + age[4]);
				
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
			String S = "To the world of programer programer";
				// {
					System.out.println("welcome!"+S);
					{
						try {
							Thread.sleep(500);
						}
						catch(Exception e) {
							System.out.println(e);
						}
						
			
					}
				//}
		}
		);
		t1.start();
	}
}
	

