package description;

/**
 * Created by liqianga on 2017-12-26.
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.89;
    }
}
