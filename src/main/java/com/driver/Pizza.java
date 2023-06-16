package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addedCheese;
    private boolean addedToppings;
    private boolean taken;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.addedCheese = false;
        this.addedToppings = false;
        this.taken=false;
        this.bill = "";
        this.price = (isVeg ? 300 : 400);
        // your code goes here

        if(isVeg){
            this.bill += "Base Price Of The Pizza: 300"+"\n";
        }
        else{
            this.bill += "Base Price Of The Pizza: 400"+"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.addedCheese){
            this.price += 80;
            this.bill += "Extra Cheese Added: 80"+"\n";
        }
        this.addedCheese = true;
        // your code goes here
    }

    public void addExtraToppings(){
        if(!this.addedToppings){
            this.price += 70;
            this.bill += "Extra Toppings Added: 70"+"\n";
        }
        this.addedToppings = true;
        // your code goes here
    }

    public void addTakeaway(){
        if(!this.taken){
            this.price += 20;
            this.bill += "Paperbag Added: 20"+"\n";
        }
        this.taken = true;
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        return this.bill+"Total Price: "+price+"\n";
    }
}
