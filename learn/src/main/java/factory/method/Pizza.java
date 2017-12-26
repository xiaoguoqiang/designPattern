package factory.method;

import java.util.ArrayList;

/**
 * Created by liqianga on 2017-12-26.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList topping;

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Add toppings:");
        for (int i = 0; i < topping.size(); i++) {
            System.out.println("" + topping.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza");
    }

    public void box() {
        System.out.println("Place pizza");
    }

    public String getName() {
        return this.name;
    }


}
