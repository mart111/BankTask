package com.example.banktask;

import java.util.List;

public class Customer {

    private List<Card> cardList;
    private int pocket;

    public Customer() {
    }

    public Customer(List<Card> cardList) {
        this.cardList = cardList;
        this.pocket = 0;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public int getPocket() {
        return pocket;
    }

    public void setPocket(int pocket) {
        this.pocket = pocket;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cardList=" + cardList +
                ", pocket=" + pocket +
                '}';
    }
}
