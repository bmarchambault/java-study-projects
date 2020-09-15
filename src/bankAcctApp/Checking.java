package bankAcctApp;

public class Checking extends Account{
    //list properties are specific to a checking account
        //debit card
        //pin etc...
int debitCardNum;
int debitCardPin;


public Checking(String name, String sSN, double initDeposit){
    super(name, sSN, initDeposit);

}

    @Override
    public int baseRate() {
        return 0;
    }


    //constructor to initialize the checking account properties

    //list methods specific



}
