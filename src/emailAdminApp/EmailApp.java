package emailAdminApp;

public class EmailApp {
    public static void main(String[] args) {
    Email email1 = new Email("John", "Smith");
        System.out.println(email1.showInfo());
//    email1.getAlternateEmail("test@gmail.com");
//        email1.getAlternateEmail();
//    email1.changePassword("n3WP@SSw0rd");
//    email1.setMailboxCapacity(50);
    }
}


//This application should do the following:
//generate an email with the following syntax:  firstname.lastname@department.company.com
//determine the department (sales, accounting, development), if none, leave blank
//generate a random string for a password
// have setters to change the password, set the mailbox capacity and define an alternate email address.
//have method to display the name, email and mailbox capacity