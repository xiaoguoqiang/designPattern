package factory.method;

/**
 * Created by liqianga on 2017-12-26.
 */
public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public abstract Pizza createPizza(String type);
}
