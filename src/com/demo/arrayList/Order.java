package com.demo.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<String> itemNames;
    private boolean cashOnDelivery;

    public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
        this.orderId = orderId;
        this.itemNames = itemNames;
        this.cashOnDelivery = cashOnDelivery;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<String> getItemNames() {
        return itemNames;
    }

    public void setItemNames(List<String> itemNames) {
        this.itemNames = itemNames;
    }

    public boolean isCashOnDelivery() {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(boolean cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

}

class Test {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        List<String> items1 = new ArrayList<>();
        items1.add("FriedRice");
        items1.add("Pasta");
        items1.add("Thortilla");
        orderList.add(new Order(101,items1,true));

        List<String> items2 = new ArrayList<>();
        items2.add("Pizza");
        items2.add("Pasta");
        orderList.add(new Order(102,items2,true));

        List<String> items3 = new ArrayList<>();
        items3.add("Burger");
        items3.add("Sandwich");
        items3.add("Pizza");
        orderList.add(new Order(103,items3,true));

        //Code here
        System.out.println("Displaying order details");
        for(Order order: orderList){
            System.out.println("Order Id:"+order.getOrderId());
            System.out.println("Items:");
            for(String item: order.getItemNames()){
                System.out.println(item);
            }
            System.out.println("---------------------------------");
        }

    }
}