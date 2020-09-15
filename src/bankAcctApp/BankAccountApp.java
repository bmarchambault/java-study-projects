package bankAcctApp;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
//testing:
       // Checking cAcct1 = new Checking("Tom Wilson", "555992222", 1500);
//        Savings sAcct1 = new Savings("Bob Dillon", "999448888", 2500);

//        cAcct1.showInfo();
//        System.out.println("*************************");
//        sAcct1.showInfo();
//        sAcct1.compound();


        //read a csv file and create accounts based on that data
        //this file could be located anywhere.
        String file = "files/NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders){
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);

        }
    }
}
