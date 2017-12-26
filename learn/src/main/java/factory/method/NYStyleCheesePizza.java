package factory.method;

/**
 * Created by liqianga on 2017-12-26.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Crated Raggiano Cheese");
    }
}
