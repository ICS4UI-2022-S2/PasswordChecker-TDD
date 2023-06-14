import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

public class PasswordCheckerTest {

    @Before
    public void beforeEachTestMethod(){
        
    }

    @Test
    public void testCheckLength() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a password:");
            String enteredPassword = input.nextLine();
            Password userPassword = new Password(enteredPassword);
            boolean validPassword = userPassword.passwordValid();
            if(validPassword){
                System.out.println("This is a valid password.");
            }else if(validPassword = false){
                System.out.println("This is not a valid password. Make sure it's between 8 to 15 characters.");
            }
        }
    }
}
