package bankAcctApp;

public class Checking extends Account{
    //list properties are specific to a checking account
        //debit card
        //pin etc...
long debitCardNum;
int debitCardPin;


public Checking(String name, String sSN, double initDeposit){
    super(name, sSN, initDeposit);
    accountNumber = "2" + accountNumber;
    setDebitCard();
}
    private void setDebitCard(){
        //casting as an in truncates the random number.
        debitCardNum = (long) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    @Override
    public void showInfo() {
    System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println(
                "Your Checking Account Features"+
                        "\n   Debit Card Number: " + debitCardNum +
                        "\n   Pin: " + debitCardPin
        );
    }

    @Override
    public int baseRate() {
        return 0;
    }


    //constructor to initialize the checking account properties

    //list methods specific



}
