package Udemy_course_projects.bankAcctApp;

public abstract class Account implements IBaseRate {
    //cant create object from here
    //list common properties for savings and checking accounts
private String name;
private String sSN;
private double balance;
private static int index = 10000;

protected String accountNumber;
protected double rate;



    //constructor to set base properties and initialize the account
public Account (String name, String sSN, double initDeposit){
   this.name = name;
   this.sSN = sSN;
   balance = initDeposit;
    System.out.println("NAME: " + name + " SSN: "+   sSN + " BALANCE: "+   balance);
    //*****set account number:*******
    //increase index each time an account is created
    index++;
    //call common methods
    this.accountNumber = setAcctNum();
    setRate();

}
//a method that forces classes to implement this method.
public abstract void setRate();


    //list common methods
    private String setAcctNum(){
    //grab last two number of the SSN
    String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length() );
    //grab the increased index number created by the constructor
    int uniqueID = index;
    int randomNum = (int) (Math.random() * Math.pow(10, 3));
            return lastTwoOfSSN + uniqueID + randomNum;
    }

    public void compound(){
        //divide the rate by 100 because rate comes as a fraction.
        double accruedInterest = balance * (rate/100);
        System.out.println("Accrued Interest: $" + accruedInterest);
        balance = balance + accruedInterest;
        printBalance();
    }

public void deposit(double amount){
        balance = balance + amount;
    System.out.println("depositing $" + amount );
    printBalance();
};

public void withdraw(double amount){
    balance = balance - amount;
    System.out.println("Withdrawing $" + amount );
    printBalance();
};

public void transfer(String toWhere, double amount){
  balance = balance-amount;
    System.out.println("Transfering $" + amount + " to " + toWhere);
    printBalance();
};

public void printBalance (){
    System.out.println("Your balance is now: $" + balance);
}

    public void showInfo(){
        System.out.println(
                "NAME: " + name + "\n" +
                "ACCOUNT NUMBER: " + accountNumber + "\n" +
                "BALANCE: " + balance + "\n" +
                "RATE: " + rate + "%"
        );
    }

}
