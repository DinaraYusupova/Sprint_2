package model;

import model.constants.Discount;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public double finalPrice(){  //метод считает цену за товар без скидки
        return amount*price;
    }
    public double discountPrice(){  //метод считает цену за товар со скидкой, если она есть
        if (getDiscount() != 0){
            return amount*price*getDiscount()/100;
        }
        return amount*price;
    }

    public boolean isVegetarian(){ //метод возвращает веганский товар или нет
        return isVegetarian;
    }

}
