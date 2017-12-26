package factory.method;

/**
 * Created by liqianga on 2017-12-26.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return new NYStyleCheesePizza();
    }
}
