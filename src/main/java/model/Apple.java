package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{
    private final String COLOUR; //цвет яблок

    public Apple(int amount,double price, String colour) { // конструктор
        this.amount = amount;
        this.price = price;
        COLOUR = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount(){
        if(COLOUR == Colour.DISCOUNT_COLOUR){
            return Discount.DISCOUNT_FOR_APPLE;
        }
        return Discount.DISCOUNT_FOR_ALL;
    }


}
