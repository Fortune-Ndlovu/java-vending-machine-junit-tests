//Declares the package name for the VendingMachine class
package com.example; 

public class VendingMachine {

    // keep track of the money inserted in the vending machine
    private int balance;

    // constructor for the VendingMachine class, it is called when an object of the VendingMachine is created.
    // initializes the balance to zero when a new vending machine is created.
    public VendingMachine() {
        this.balance = 0;
    }

    // allows users to insert coins into the VendingMachine
    public void insertCoin(int amount) {
        this.balance += amount;
    }

    // Checks if they have enough balance to purchase
    public String selectProduct(String product, int price) {
        if (balance >= price) {
            balance -= price;
            return "Here is your " + product + ". Enjoy!";
        } else {
            return "Insufficient funds. Please insert more coins.";
        }
    }

    // return current balance of the vending machine
    public int getBalance() {
        return balance;
    }
}
