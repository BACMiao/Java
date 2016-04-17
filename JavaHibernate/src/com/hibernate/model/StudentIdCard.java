package com.hibernate.model;

/**
 * Created by King on 2016/2/18.
 */
public class StudentIdCard {
    private int cardId;
    private String academy;

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
}
