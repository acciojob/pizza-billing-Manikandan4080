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
        addedCheese = false;
        addedToppings = false;
        taken=false;
        this.bill = "";
        price = (isVeg ? 300 : 400);
        // your code goes here

        if(isVeg){
            bill += "Base Price Of The Pizza: 300"+"\n";
        }
        else{
            bill += "Base Price Of The Pizza: 400"+"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!addedCheese){
            price += 80;
            bill += "Extra Cheese Added: 80"+"\n";
        }
        addedCheese = true;
        // your code goes here
    }

    public void addExtraToppings(){
        if(!addedToppings){
            if(isVeg){
                price += 70;
                bill += "Extra Toppings Added: 70"+"\n";
            }
            else{
                price += 120;
                bill += "Extra Toppings Added: 120"+"\n";
            }
        }
        addedToppings = true;
        // your code goes here
    }

    public void addTakeaway(){
        if(!taken){
            price += 20;
            bill += "Paperbag Added: 20"+"\n";
        }
        taken = true;
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        return this.bill+"Total Price: "+price+"\n";
    }
}
