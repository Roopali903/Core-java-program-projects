import java.util.*;

public class StringExample1 {
	

	public static void main(String[] args) {
		String s, s1;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		s1=s.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]","");
		System.out.println(s1);
		}
		 
	}
