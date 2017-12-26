package description;

import java.io.FileInputStream;

/**
 * Created by liqianga on 2017-12-26.
 */
public class StarbuzzCoffee {

    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println("description = " + beverage.getDescription());
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println("description = " + beverage.getDescription());
        System.out.println("cost = " + beverage.cost());

    }


}
