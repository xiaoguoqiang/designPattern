package composite;

import java.util.Iterator;

/**
 * Created by liqianga on 2018/1/31.
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private double price;
    private boolean isVegetaration;

    public MenuItem (String name, String description, double price, boolean isVegetaration){
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetaration = isVegetaration;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public boolean isVegetaration() {
        return this.isVegetaration;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("name is " + getName() + "; des is " + getDescription() + "; price is " + getPrice());
    }

    @Override
    public Iterator creatIterator() {
        return new NullIterator();
    }
}
