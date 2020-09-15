package bankAcctApp;

public class Checking extends Account{
    //list properties are specific to a checking account
        //debit card
        //pin etc...
int debitCardNum;
int debitCardPin;


public Checking(String name, String sSN, double initDeposit){
    super(name, sSN, initDeposit);
    System.out.println("new checking account");
    System.out.println("Name: " + name);
}

    @Override
    public int baseRate() {
        return 0;
    }


    //constructor to initialize the checking account properties

    //list methods specific



}
