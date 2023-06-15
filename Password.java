public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public boolean validLength(){
        int passwordLength = this.password.length();
        boolean isLengthValid;
        if(passwordLength >= 8 && passwordLength <= 15){
            isLengthValid = true;
        }else{
            isLengthValid = false;
        }
        return isLengthValid;
    }

    public boolean hasLowercase(){
        boolean hasLowercase = false;
        char[] letters = this.password.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char charSpot = letters[i];
            String stringSpot = String.valueOf(charSpot);
            stringSpot = stringSpot.toLowerCase();
            char lowercaseSpot = stringSpot.charAt(0);
            if(charSpot == lowercaseSpot){
                hasLowercase = true;
            }
        }
        return hasLowercase;
    }
}
