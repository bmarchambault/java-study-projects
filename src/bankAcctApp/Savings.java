package bankAcctApp;

public class Savings extends Account {

    //list properties are specific to a savings account
int safetyDepositBoxID;
int safetyDepositBoxKey;
    //constructor to initialize the savings account properties

    public Savings ( String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        //1 indicated this a checking - do the same for the savings.
        accountNumber = "1" + accountNumber;


    }
    //list methods specific
    //example of polymorphism
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }

    @Override
    public int baseRate() {
        return 15;
    }





}