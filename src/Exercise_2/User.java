package Exercise_2;

enum Role {
    ADMIN,
    CUSTOMER
}

public class User {
    private String user;
    private String password;

    void setUser(String user){this.user = user;}
    String getUser(){return this.user;}

    void setPassword(String password){this.password = password;}
    String getPassword(){return this.password;}

    boolean password(String password){
        int uppercaseCounter=0, numberCounter=0, characterCounter=0;

        for(int i=0; i<password.length(); i++){
            if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
                uppercaseCounter++;
            } else if(password.charAt(i)>='0' && password.charAt(i)<='9'){
                numberCounter++;
            } else if(password.charAt(i)=='#' || password.charAt(i)=='!' || password.charAt(i)=='%'){
                characterCounter++;
            }
        }

        if(uppercaseCounter>=1 && numberCounter>=3 && characterCounter>=1) {
            return true;
        } else {
            return false;
        }
    }
}
