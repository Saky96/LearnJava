package com.demo.assignments.ePay;

public class Tester {
    public static void main(String[] args) {
        User jack = new User(101, "Jack", "jack@infy.com", 1000);
        EPayWallet.processPaymentByUser(jack, 700);

        User jill = new KYCUser(102, "Jill", "jill@infy.com", 3000);
        EPayWallet.processPaymentByUser(jill, 1500);
        EPayWallet.processPaymentByUser(jill, 800);
        EPayWallet.processPaymentByUser(jill, 1200);
    }
}
