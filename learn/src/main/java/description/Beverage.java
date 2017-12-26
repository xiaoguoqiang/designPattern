package description;

/**
 * Created by liqianga on 2017-12-26.
 */
public abstract class Beverage {

    private String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

}
