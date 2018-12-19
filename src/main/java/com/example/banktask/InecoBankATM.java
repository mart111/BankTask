package com.example.banktask;

import java.util.Random;

public class InecoBankATM extends ATM {


    public InecoBankATM() {
        super.ATMBalance = new Random().nextInt(Integer.MAX_VALUE / 2);
    }

    public void giveMoney(Customer c, Card card, int howMuch) throws Exception {
        super.giveMoney(c, card, howMuch);
    }

    @Override
    public String toString() {
        return "InecoBankATM{" +
                "ATMBalance=" + ATMBalance +
                '}';
    }
}
