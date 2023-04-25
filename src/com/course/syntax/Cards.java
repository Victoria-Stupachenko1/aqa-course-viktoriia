package com.course.syntax;

public class Cards {
    // Private fields
    private static int nextId = 1;
    private int id;
    private String number;
    private String expireDate;
    private String cvv;
    private String cardType;

    // Constructor
    public Cards(String number, String expireDate, String cvv, String cardType) {
        this.id = nextId;
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        if (cardType.equalsIgnoreCase("Visa") || cardType.equalsIgnoreCase("MasterCard")) {
            this.cardType = cardType;
        } else {
            throw new IllegalArgumentException ("Card type must be Visa or MasterCard");
        }
        nextId++;
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    public String getExpireDate() {
        return expireDate;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getCardType() {
        return cardType;
    }
    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", expireDate=" + expireDate +
                ", cvv=" + cvv +
                ", cardType=" + cardType +
                '}';
    }

    //cards field is an ArrayList of objects, that contains next private fields: id; number; expireDate; cvv;
    // cardType. cardType can be only one from next values: Visa or MasterCard. id must be generated, like user id.
    // All values except of id must be added in process of creation Card object.
    // Also, card class must have getters and setters for all fields except of setter for id.
}
