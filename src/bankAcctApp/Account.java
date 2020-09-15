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
static int index = 10000;


    //constructor to set base properties and initialize the account
public Account (String name, String sSN, double initDeposit){
   this.name = name;
   this.sSN = sSN;
   balance = initDeposit;
    System.out.println("NAME: " + name + " SSN: "+   sSN + " BALANCE: "+   balance);
    //*****set account number:*******
    //increase index each time an account is created
    index++;
    //call this method
    this.accountNumber = setAcctNum();

}
    //list common methods
    //1. account number
    private String setAcctNum(){
    //grab last two number of the SSN
    String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length() );
    //grab the increased index number created by the constructor
    int uniqueID = index;
    int randomNum = (int) (Math.random() * Math.pow(10, 3));
            return lastTwoOfSSN + uniqueID + randomNum;
    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name + "\n" +
                "ACCOUNT NUMBER: " + accountNumber + "\n" +
                "BALANCE: " + balance
        );
    }

}
