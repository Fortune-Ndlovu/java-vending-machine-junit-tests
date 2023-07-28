package com.example;

public class VendingMachine {

    private int balance;

    public VendingMachine() {
        this.balance = 0;
    }

    public void insertCoin(int amount) {
        this.balance += amount;
    }

    public String selectProduct(String product, int price) {
        if (balance >= price) {
            balance -= price;
            return "Here is your " + product + ". Enjoy!";
        } else {
            return "Insufficient funds. Please insert more coins.";
        }
    }

    public int getBalance() {
        return balance;
    }
}
