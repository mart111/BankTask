package com.example.banktask;

import java.util.Random;

public class Card {

    private int balance;
    private Bank bank;
    private long cardID;

    public Card() {
        this.cardID = new Random().nextInt(Integer.MAX_VALUE);
        this.balance = 1000;
    }

    public Card(Bank bank) {
        this.bank = bank;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public long getCardID() {
        return cardID;
    }

    @Override
    public String toString() {
        return "Card{" +
                "balance=" + balance +
                ", bank=" + bank +
                ", cardID=" + cardID +
                '}';
    }
}
