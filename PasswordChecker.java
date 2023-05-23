public class PasswordChecker {
    private String password;

    public PasswordChecker(String password) {
        this.password = password;
    }

    public int checkLength(String password){
        int passwordLength = this.password.length();
        return passwordLength;
    }
}
