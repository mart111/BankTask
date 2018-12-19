package com.example.banktask;

import java.util.Random;

public class AmeriaBankATM extends ATM {

    public AmeriaBankATM() {
        super.ATMBalance = new Random().nextInt(Integer.MAX_VALUE / 2);
    }

    public void giveMoney(Customer c, Card card, int howMuch) throws Exception {
        super.giveMoney(c, card, howMuch);
    }

    @Override
    public String toString() {
        return "AmeriaBankATM{" +
                "ATMBalance=" + ATMBalance +
                '}';
    }
}

