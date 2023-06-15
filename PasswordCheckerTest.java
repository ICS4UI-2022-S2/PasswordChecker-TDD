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
        userPassword.setPassword("PASSwORD");
        boolean hasLowercase = userPassword.hasLowercase();
        assertEquals(true, hasLowercase);
    }

    @Test
    public void testUppercaseCheck(){
        userPassword.setPassword("passWord");
        boolean hasUppercase = userPassword.hasUppercase();
        assertEquals(true, hasUppercase);
    }

    @Test
    public void testDigitCheck(){
        userPassword.setPassword("passw0rd");
        boolean hasDigit = userPassword.hasDigit();
        assertEquals(true, hasDigit);
    }

    @Test
    public void testSymbolCheck(){
        userPassword.setPassword("p@ssword");
        boolean hasSymbol = userPassword.hasSymbol();
        assertEquals(true, hasSymbol);
    }

}
