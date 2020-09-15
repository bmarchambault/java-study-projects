package bankAcctApp;

public abstract class Account implements IBaseRate {
    //cant create object from here
    //list common properties for savings and checking accounts
//String firstName;
//String lastName;
String accountNumber;
String sSN;
double balance;
double rate;
//String name = firstName + " " + lastName;
    String name;
    //constructor to set base properties and initialize the account
public Account (String name, String sSN, double initDeposit){
   this.name = name;
   this.sSN = sSN;
   balance = initDeposit;
    System.out.println("name: " + name + " SSN: "+   sSN + " Balance: "+   balance);
}
    //list common methods

}
