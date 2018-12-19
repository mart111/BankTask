package com.example.banktask;

public abstract class ATM {

    protected int ATMBalance;

    protected void giveMoney(Customer customer, Card card, int howMuch) throws Exception {

        if (card.getBank().checkIfCustomerValid(customer)) {
            int balance = card.getBank().checkCustomerAccount(customer, card);
            if (balance <= this.ATMBalance && howMuch <= balance) {
                card.setBalance(card.getBalance() - howMuch);
                customer.setPocket(howMuch);
                this.ATMBalance -= howMuch;
            } else throw new Exception("ATM is currently unavailable");
        } else throw new Exception("Can not recognize customer details: " + customer);
    }

    public int getATMBalance() {
        return ATMBalance;
    }
}
