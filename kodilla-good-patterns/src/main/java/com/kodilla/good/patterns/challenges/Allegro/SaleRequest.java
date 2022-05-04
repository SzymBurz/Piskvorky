package com.kodilla.good.patterns.challenges.Allegro;

public class SaleRequest {
    Object user;
    String paymentStatus;
    Object auction;

    public SaleRequest(Object user, String paymentStatus, Object auction) {
        this.user = user;
        this.paymentStatus = paymentStatus;
        this.auction = auction;
    }

    public Object getUser() {
        return user;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public Object getAuction() {
        return auction;
    }
}
