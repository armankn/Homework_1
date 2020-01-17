package Exercise_2;

import java.util.ArrayList;

public class Main {

    static String password = "Aa#Ab12345$";

    public static void main(String[] args) {

        User user = new User();
        user.setPassword(password);

        // here should be ArrayList of users(2 ADMIN and 8 CUSTOMER)
        // ArrayList users = new ArrayList();

        System.out.print("Password is: " + password);
        if(user.password(user.getPassword())) {
            System.out.println("  which is acceptable");
            //here should each user(ADMIN, CUSTOMER) get password
         } else {
            System.out.println("  which is not acceptable. It should contain \n" +
                    "1. at least one uppercase character \n" +
                    "2. at least 3 numbers \n" +
                    "3. at least one special character (“#”, “!”, or “%”)");
        }
    }
}