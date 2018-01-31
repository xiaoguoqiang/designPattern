package state;

/**
 * Created by liqianga on 2018/1/31.
 */
public class SoldOutState implements State {
    private CandyMachine candyMachine;

    public SoldOutState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    public void insertQuarter() {
        System.out.println("Sold out");
    }

    public void ejectQuarter() {
        System.out.println("Sold out");
    }

    public void turnCrank() {
        System.out.println("Sold out");
    }

    public void dispense() {
        System.out.println("Sold out");
    }
}
