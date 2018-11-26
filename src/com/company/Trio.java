package com.company;

public class Trio implements interface MenuItem {
    sandwich sandwich;
    salad salad;
    drink drink;
    public Trio{
        Trio trio=new trio(sandwich, salad, drink);
        this.sandwich=sandwich;
        this.salad=salad;
        this.drink=drink;
    }
    public getPrice() {
        return sandwich.getPrice();
        return salad.getPrice();
        return drink.getPrice();
    }

    public lowestOfThree() {
        int first=sandwich.getPrice();
        int second=salad.getPrice();
        int third=drink.getPrice();
        int lowestOfThree 
    }





}
