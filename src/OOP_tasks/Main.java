package OOP_tasks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User ("John Doe", "johnDoe@gmail.com", "Main");
        user.setPhoneNumber ("+12345678");
        Address billingAddress = new Address ("Great Britain", "London", "Glasgow St.", "1A", "02104");
        user.setBillingAddress (billingAddress);
        user.addCard ("4142567898764567", "02/24", "123", "VISA");
        user.addCard ("41425678723764567", "02/28", "123", "MASTERCard");
        ArrayList<Cards> cards = user.getCards ();

        System.out.println (cards);

        Manager manager = new Manager ("First Manager", "fm@gmail.com", "Admin", "Local Manager");
        manager.setResponsibilityDistrict ("Obolonskyi district");
        manager.setWorkPhoneNumber ("+123876876");


        User user2 = new User ("Dan Brown", "db@gmail.com", "Customer");
        Address billingAddress1 = new Address ("Ukraine", "Kyiv", "Khreschatyk", "1", "09154");
        user2.setBillingAddress (billingAddress1);

        user.printUserInfo ( );
        user2.printUserInfo ( );
        manager.printUserInfo ();

    }

}
