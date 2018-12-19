package com.example;

import com.example.banktask.Card;
import com.example.banktask.Customer;
import com.example.banktask.InecoBank;
import com.example.banktask.InecoBankATM;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings(value = "unchecked")
public class App {


    public static void main(String... args) throws Exception {


        List<Customer> customers = new ArrayList<>();
        List<Card> cards = new ArrayList<>();

        InecoBankATM inecoATM = new InecoBankATM();
        Customer customer = new Customer();
        Card inecoCard = new Card();
        InecoBank inecoBank = new InecoBank();
        inecoCard.setBank(inecoBank);
        customers.add(customer);
        inecoBank.setCustomers(customers);
        cards.add(inecoCard);
        inecoBank.setCards(cards);
        customer.setCardList(cards);

        Customer customer1 = new Customer();
        Card inecoCard1 = new Card();
        inecoCard1.setBank(inecoBank);
        customers.add(customer1);
        cards.add(inecoCard1);
        inecoBank.setCustomers(customers);
        inecoBank.setCards(cards);
        customer1.setCardList(cards);

        Customer customer2 = new Customer();
        Card inecoCard2 = new Card();
        inecoCard2.setBank(inecoBank);
        customers.add(customer2);
        cards.add(inecoCard2);
        inecoBank.setCustomers(customers);
        inecoBank.setCards(cards);
        customer2.setCardList(cards);

        System.out.println(inecoATM);

        new Thread(() -> {
            try {
                inecoATM.giveMoney(customer1, inecoCard1, 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                inecoATM.giveMoney(customer, inecoCard, 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                inecoATM.giveMoney(customer2, inecoCard2, 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(1000);
        System.out.println(inecoATM);
    }
}


