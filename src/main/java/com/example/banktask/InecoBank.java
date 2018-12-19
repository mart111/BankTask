package com.example.banktask;

import java.util.List;

public class InecoBank implements Bank {

    private List<Customer> customers;
    private List<Card> cards;

    public InecoBank() {
    }

    public InecoBank(List<Customer> customers, List<Card> cards) {
        this.customers = customers;
        this.cards = cards;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "InecoBank{" +
                "customers=" + customers +
                ", cards=" + cards +
                '}';
    }

    @Override
    public boolean checkIfCustomerValid(Customer customer) {
        return customers.contains(customer);
    }

    @Override
    public int checkCustomerAccount(Customer customer, Card card) throws Exception {
        Customer c = customers.get(customers.indexOf(customer));
        Card cd = c.getCardList().get(c.getCardList().indexOf(card));
        if (cd.getBalance() != 0) {
            return cd.getBalance();
        } else throw new Exception("You have not money in your account: " + cd);
    }
}
