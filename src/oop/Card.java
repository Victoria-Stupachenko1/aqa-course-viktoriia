package oop;

public class Card {
    // Private fields
    private static int id;
    private String number;
    private String expireDate;
    private String cvv;
    private CardType cardType;


    // 1. Interfaces. Enum Task 1
    public enum CardType {
        VISA,
        MASTERCARD
    }

    // 1. Exceptions // 1. Interfaces. Enum Task 1  // Constructor
    public Card(String number, String expireDate, String cvv, CardType cardType) {
            this.number = number;
            this.expireDate = expireDate;
            this.cvv = cvv;
            setCardType(cardType);
            id++;
        }


    // 1. Interfaces. Enum Task 1
    public void setCardType(CardType cardType) {
            this.cardType = cardType;
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

    public CardType getCardType() {
        return CardType.valueOf(String.valueOf(cardType));
    }

    @Override
    public String toString() {
        return "Card{" + "id='" + id + '\'' + ", number='" + number + '\'' + ", expireDate=" + expireDate + ", cvv=" + cvv + ", cardType=" + cardType + '}';
    }

    //cards field is an ArrayList of objects, that contains next private fields: id; number; expireDate; cvv;
    // cardType. cardType can be only one from next values: Visa or MasterCard. id must be generated, like user id.
    // All values except of id must be added in process of creation Card object.
    // Also, card class must have getters and setters for all fields except of setter for id.
}
