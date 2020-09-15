package bankAcctApp;

public class Savings extends Account {

    //list properties are specific to a savings account
int safetyDepositBoxID;
int safetyDepositBoxKey;
    //constructor to initialize the savings account properties

    public Savings ( String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        System.out.println("new savings account");

    }

    @Override
    public int baseRate() {
        return 15;
    }

    //list methods specific



}