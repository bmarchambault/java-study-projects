package branceProjectFiles.mystore;

import peoplestuff.Person;

import java.util.List;

public class Cashier extends Person {
    public Cashier(String newPersonFirstName, String newPersonLastName, int newPersonAge) {
        super(newPersonFirstName, newPersonLastName, newPersonAge);
    }

    public double total(List<Product> cart) {
        double sum = 0;
        for (Product item : cart){
            sum += item.getPrice();//at first is says variable sum might not have been initialized.  make it equal something first. if you want a variable to change in a loop, you need to give it an initial value first.
        }
        return sum;
    }
}
