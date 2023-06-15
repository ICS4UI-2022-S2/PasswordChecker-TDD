import org.junit.Before;
import org.junit.Test;

import junit.framework.TestFailure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Scanner;

public class PasswordCheckerTest {

    private Password userPassword;

    @Before
    public void beforeEachTestMethod(){
        userPassword = new Password(null);
    }

    @Test
    public void testLengthCheck() {
        try (Scanner input = new Scanner(System.in)) {
            userPassword.setPassword("password");
            boolean validLength = userPassword.validLength();
            assertEquals(true, validLength);
        }
    }

    @Test
    public void testLowercaseCheck(){
        try(Scanner input = new Scanner(System.in)){
            userPassword.setPassword("PASSwORD");
            boolean hasLowercase = userPassword.hasLowercase();
            assertEquals(true, hasLowercase);
        }
    }

}
