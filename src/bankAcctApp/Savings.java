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
        //safety box:
        setSafetyDepositBox();


    }
    //list methods specific
    private void setSafetyDepositBox(){
        //casting as an in truncates the random number.
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
    //example of polymorphism
    @Override
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features"+
                "\n   Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n   Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }

    @Override
    public int baseRate() {
        return 15;
    }





}