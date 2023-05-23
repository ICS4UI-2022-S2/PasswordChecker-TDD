import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

public class PasswordCheckerTest {

    @Before
    public void beforeEachTestMethod(){
        
    }

    @Test
    public void testCheckLength() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password:");
        String userPassword = input.nextLine();
        PasswordChecker c = new PasswordChecker(userPassword);
        int passwordLength = c.checkLength(userPassword);
        if(passwordLength < 8 || passwordLength > 15){
            System.out.println("This is not a valid password. Please make the password between 8 and 15 characters.");
        }else if(passwordLength >= 8 && passwordLength <= 15){
            System.out.println("This is a valid password.");
        }
    }
}
