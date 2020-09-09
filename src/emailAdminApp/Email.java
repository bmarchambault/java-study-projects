package emailAdminApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String email;
    //suffix can be anything
    private String companySuffix = "company.com";

    public Email (){};

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        //CALL A METHOD THAT ASKS FOR THE DEPARTMENT - RETURNS THE DEPARTMENT
        this.department = setDepartment();
        //RETURN A RESPONSE:
        System.out.println("Department: " + this.department);

        //CALL A METHOD THAT RETURNS A RANDOM PASSWORD:
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //COMBINE ELEMENTS TO GENERATE AN EMAIL
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);

    }

//    ASK FOR DEPARTMENT
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();
        if (depChoice == 1) {
            return "sales";
        }else if (depChoice == 2){
            return "development";
        }else if (depChoice == 3){
            return "accounting";
        }else{
            return "";
        }
    }

    //random password generator:
private String randomPassword(int length){
        //int length will determine how long our password needs to be
    //defining which characters to choose from to generate a password:
    //this is the array of characters to iterate through
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
        //this is the password.  a new sequence of characters of the size of length.
    char[] password = new char[length];
    //iteration as many times as the length of the password needs to be - determined by the parameter
    for(int i = 0; i<length; i++){
        //math.random is 0-1 * the number of characters in passwordSet
        int random = (int) (Math.random() * passwordSet.length());
        //password character at ith iteration equals a random character from passwordSet
        password[i] = passwordSet.charAt(random);
    }
    //casting a set of characters in the character array into a string of characters:
return new String (password);

}

    public String getFirstName() {
        return firstName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getDefaultPasswordLength() {
        return defaultPasswordLength;
    }

    public void setDefaultPasswordLength(int defaultPasswordLength) {
        this.defaultPasswordLength = defaultPasswordLength;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanySuffix() {
        return companySuffix;
    }

    public void setCompanySuffix(String companySuffix) {
        this.companySuffix = companySuffix;
    }
}
