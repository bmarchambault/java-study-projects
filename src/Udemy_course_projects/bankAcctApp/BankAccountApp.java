package Udemy_course_projects.bankAcctApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        //data structure for the objects:
        List<Account> accounts = new LinkedList<Account>();
        //add elements based on account type in the method below

//testing:
       // Checking cAcct1 = new Checking("Tom Wilson", "555992222", 1500);
//        Savings sAcct1 = new Savings("Bob Dillon", "999448888", 2500);

//        cAcct1.showInfo();
//        System.out.println("*************************");
//        sAcct1.showInfo();
//        sAcct1.compound();


        //read a csv file and create accounts based on that data
        //this file could be located anywhere.
        String file = "src/Udemy_course_projects/bankAcctApp/files/NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {

            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSn + " " + accountType + " $" + initDeposit);

            if (accountType.equalsIgnoreCase("Savings")) {
                System.out.println("Open a  SAVINGS");
                accounts.add(new Savings(name, sSn, initDeposit));
            } else if (accountType.equalsIgnoreCase("checking")) {
                System.out.println("Open a  CHECKING ACCOUNT");
                accounts.add(new Checking(name, sSn, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
//        accounts.get(5).showInfo();//testing an element

    //show info for each account created.
        for (Account acct : accounts) {
            System.out.println("\n***************");
            acct.showInfo();
        }
//EXPERIMENT WITH WHAT YOU CAN DO.
accounts.get((int)Math.random()* accounts.size()).deposit(100);



    }
}
