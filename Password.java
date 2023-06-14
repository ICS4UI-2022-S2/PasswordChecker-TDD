public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean passwordValid(){
        int passwordLength = this.password.length();
        boolean isPasswordValid;
        if(passwordLength >= 8 || passwordLength <= 15){
            isPasswordValid = true;
        }else{
            isPasswordValid = false;
        }
        return isPasswordValid;
    }
}
