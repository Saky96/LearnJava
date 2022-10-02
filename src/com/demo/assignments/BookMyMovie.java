package com.demo.assignments;

public class BookMyMovie {
    int movieId;
    int noOfTickets;
    double discount;
    double totalAmount;

    public BookMyMovie(int movieId, int noOfTickets) {
        this.movieId = movieId;
        this.noOfTickets = noOfTickets;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void calculateDiscount(){
        if((this.getMovieId() == 101 || this.getMovieId() == 102 || this.getMovieId() == 103) && this.getNoOfTickets() < 5){
            setDiscount(0);
        } else if ((this.getMovieId() == 101 || this.getMovieId() == 103) && (this.getNoOfTickets() >= 5 &&  this.getNoOfTickets() <= 15)) {
            setDiscount(15);
        }
        else if ((this.getMovieId() == 101 || this.getMovieId() == 103) && (this.getNoOfTickets() >= 10 &&  this.getNoOfTickets() <= 15)) {
            setDiscount(20);
        }
        else if (this.getMovieId() == 102 && (this.getNoOfTickets() >= 5 &&  this.getNoOfTickets() <= 15)) {
            setDiscount(10);
        }
        else if (this.getMovieId() == 102 && (this.getNoOfTickets() >= 10 &&  this.getNoOfTickets() <= 15)) {
            setDiscount(15);
        }
    }

    public double calculateTicketAmount(){
        int baseFare = 0;
        switch (this.movieId){
            case 101:
                baseFare = 120;
                break;
            case 102:
                baseFare = 170;
                break;
            case 103:
                baseFare = 150;
                break;
            default:
                baseFare = 0;
                break;
        }

        double discountAmount = baseFare * this.noOfTickets * (discount/100);
        double totalAmount = ((baseFare * this.noOfTickets) - discountAmount);
        return totalAmount;
    }


}
