package com.demo.assignments.ePay;

public class KYCUser extends User {
    int rewardPoints;

    public KYCUser(int id, String username, String email, double walletBalance) {
        super(id, username, email, walletBalance);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    @Override
    public boolean makePayment(double billAmount){
        if(this.walletBalance < billAmount){
            return false;
        }
        else {
            this.rewardPoints = this.rewardPoints + (int) (billAmount * 10 / 100);
            this.walletBalance = this.walletBalance - billAmount;
            return true;
        }
    }
}
