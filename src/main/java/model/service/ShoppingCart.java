package model.service;

import model.Food;
import model.constants.Discount;

public class ShoppingCart {
    Food[] purchases;

    public ShoppingCart(Food[] purchases) { // конструктор
        this.purchases = new Food[purchases.length];
        for(int i = 0; i < purchases.length; i++) {
            this.purchases[i] =purchases[i];
        }
    }

    public double getSum(){ //общая сумма товаров в корзине без скидки
        double sum = 0;
        for (Food purchase : purchases) {
            sum += purchase.finalPrice();
        }
        return sum;
    }

   public double getSumWithDiscount(){ //общая сумма товаров в корзине со скидкой,
        double sum = 0;
        for (int i = 0; i < purchases.length; i++) {
            sum += purchases[i].discountPrice();
        }
        return sum;
    }

    public double getSumOfVegan() { //общая сумма всех вегетарианских продуктов в корзине без скидки.
        double sum = 0;
        for (Food purchase : purchases) {
            if (purchase.isVegetarian()) {
                sum += purchase.finalPrice();
            }
        }
            return sum;

    }
}
