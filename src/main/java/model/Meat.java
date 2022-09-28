package model;

import model.constants.Discount;

public class Meat extends Food{
    public Meat(int amount,double price) { // конструктор
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }
    @Override
    public double getDiscount(){
        return Discount.DISCOUNT_FOR_ALL;
    }

}
