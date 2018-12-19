package com.example.banktask;

public interface Bank {

    boolean checkIfCustomerValid(Customer customer);

    int checkCustomerAccount(Customer customer, Card card) throws Exception;

}
