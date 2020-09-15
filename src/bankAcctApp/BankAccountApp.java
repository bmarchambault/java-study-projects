package bankAcctApp;

public class BankAccountApp {
    public static void main(String[] args) {


        //read a csv file and create accounts based on that data
        Checking cAcct1 = new Checking("Tom Wilson", "555992222", 1500);

        Savings sAcct1 = new Savings("Bob Dillon", "999448888", 2500);

        cAcct1.showInfo();
        System.out.println("*************************");
        sAcct1.showInfo();

        sAcct1.compound();
    }
}
