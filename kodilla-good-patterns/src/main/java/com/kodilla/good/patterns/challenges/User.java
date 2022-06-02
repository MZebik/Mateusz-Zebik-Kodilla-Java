package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String nickName;
    private String adres;
    private String creditCard;

    public User(String name, String nickName, String adres, String creditCard) {
        this.name = name;
        this.nickName = nickName;
        this.adres = adres;
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getAdres() {
        return adres;
    }

    public String getCreditCard() {
        return creditCard;
    }
}
