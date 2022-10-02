package com.demo.assignments.ePay;

public class EPayWallet {
    public static void processPaymentByUser(User user, double billAmount){
            if(user instanceof KYCUser){
                if(user.makePayment(billAmount)){
                    System.out.printf("Congratulations %s, payment of %.1f was successful \n", user.username, billAmount);
                }
                else {
                    System.out.printf("Sorry %s, not enough balance to make payment \n", user.username);
                }
                System.out.printf("Your wallet balance is %.1f \n", user.walletBalance);
                System.out.printf("You have %d reward points \n", ((KYCUser)user).rewardPoints);
            }
            else {
                if(user.makePayment(billAmount)){
                    System.out.printf("Congratulations %s, payment of %.1f was successful \n", user.username, billAmount);
                }
                else {
                    System.out.printf("Sorry %s, not enough balance to make payment \n", user.username);
                }
                System.out.printf("Your wallet balance is %.1f \n", user.walletBalance);
            }
            System.out.println("---------------------------------------------------------------------------");
    }
}
