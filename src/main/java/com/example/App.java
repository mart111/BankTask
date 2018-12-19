package com.example;

import com.example.banktask.Card;
import com.example.banktask.Customer;
import com.example.banktask.InecoBank;
import com.example.banktask.InecoBankATM;

import java.util.Arrays;

@SuppressWarnings(value = "unchecked")
public class App {


    public static void main(String... args) throws Exception {

        InecoBankATM inecoATM = new InecoBankATM();
        Customer customer = new Customer();
        Card inecoCard = new Card();
        InecoBank inecoBank = new InecoBank();
        inecoCard.setBank(inec


                oBank);
        inecoBank.setCustomers(Arrays.asList(customer));
        inecoBank.setCards(Arrays.asList(inecoCard));
        customer.setCardList(Arrays.asList(inecoCard));
        System.out.println(inecoATM);
        inecoATM.giveMoney(customer, inecoCard, 20);
        System.out.println(inecoATM);
    }
}


