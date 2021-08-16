package validation;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {
	
public static void main(String s[]) {
    Scanner n = new Scanner(System.in);
        String password1 = n.next();
 
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        boolean validPassword = isValidPassword(password1,regex);
        System.out.println("Java2blog@ is valid password:" +validPassword);
 
}
public static boolean isValidPassword(String password,String regex)
{
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(password);
    return matcher.matches();
	
	}
}

