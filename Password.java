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
            if(charSpot >= 97 && charSpot <= 122){
                hasLowercase = true;
            }
        }
        return hasLowercase;
    }

    public boolean hasUppercase(){
        boolean hasUppercase = false;
        char[] letters = this.password.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char charSpot = letters[i];
            if(charSpot >= 65 && charSpot <= 90){
                hasUppercase = true;
            }
        }
        return hasUppercase;
    }

    public boolean hasDigit(){
        boolean hasDigit = false;
        char[] letters = this.password.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char charSpot = letters[i];
            if(charSpot >= 48 && charSpot <= 57){
                hasDigit = true;
            }
        }
        return hasDigit;
    }

    public boolean hasSymbol(){
        boolean hasSymbol = false;
        char[] letters = this.password.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char charSpot = letters[i];
            if(charSpot >= 35 && charSpot <= 37 || charSpot == 33 || charSpot == 64){
                hasSymbol = true;
            }
        }
        return hasSymbol;
    }

    public boolean passwordValid(){
        boolean validPassword = false;

        //Check password length
        boolean validLength = false;
        if(this.password.length() >= 8 && this.password.length() <= 15){
            validLength = true;
        }else{
            validLength = false;
        }

        //Check individual characters
        boolean lowercase = false;
        boolean uppercase = false;
        boolean digit = false;
        boolean symbol = false;
        char[] letters = this.password.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char charSpot = letters[i];
            //Check lowercase
            if(charSpot >= 97 && charSpot <= 122){
                lowercase = true;
            }
            //Check uppercase
            if(charSpot >= 65 && charSpot <= 90){
                uppercase = true;
            }
            //Check digit
            if(charSpot >= 48 && charSpot <= 57){
                digit = true;
            }
            //Check symbol
            if(charSpot >= 35 && charSpot <= 37 || charSpot == 33 || charSpot == 64){
                symbol = true;
            }
        }

        //Pass the valid password if all checks passed
        if(validLength && lowercase && uppercase && digit && symbol){
            validPassword = true;
        }
        return validPassword;
    }

}
