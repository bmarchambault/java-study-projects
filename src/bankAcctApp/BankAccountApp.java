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
        String file = "src/files/NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders){

            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSn + " " + accountType + " $" +  initDeposit);

            if (accountType.equalsIgnoreCase("Savings")){
                System.out.println("Open a  SAVINGS");
            }else if(accountType.equalsIgnoreCase("checking")){
                System.out.println("Open a  CHECKING ACCOUNT");
            }else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }


//            System.out.println(accountHolder[1]);
//            System.out.println(accountHolder[2]);
//            System.out.println(accountHolder[3]);

        }
    }
}
