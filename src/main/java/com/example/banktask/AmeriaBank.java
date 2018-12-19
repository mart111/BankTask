package com.example.banktask;

import java.util.List;

public class AmeriaBank implements Bank {

    private List<Card> bankCardList;
    private List<Customer> customers;

    public AmeriaBank() {
    }

    public AmeriaBank(List<Card> bankCardList, List<Customer> customers) {
        this.bankCardList = bankCardList;
        this.customers = customers;
    }

    public List<Card> getBankCardList() {
        return bankCardList;
    }

    public void setBankCardList(List<Card> bankCardList) {
        this.bankCardList = bankCardList;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean checkIfCustomerValid(Customer customer) {
        return customers.contains(customer);
    }

    @Override
    public int checkCustomerAccount(Customer customer, Card card) throws Exception {
        Customer c = customers.get(customers.indexOf(customer));
        Card cd = c.getCardList().get(c.getCardList().indexOf(card));
        if (cd.getCardID() != 0) {
            return cd.getBalance();
        } else throw new Exception("You have not money in your account: " + cd);
    }
}
