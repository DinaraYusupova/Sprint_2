import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Meat meat = new Meat(5,100);
        Apple redApple = new Apple(10,50,"red");
        Apple greenApple = new Apple(8,60,"green");

        Food[] buy  = {meat,redApple,greenApple};
        ShoppingCart myFood = new ShoppingCart(buy);
        System.out.println(myFood.getSum());
        System.out.println(myFood.getSumWithDiscount());
        System.out.println(myFood.getSumOfVegan());
    }
}
