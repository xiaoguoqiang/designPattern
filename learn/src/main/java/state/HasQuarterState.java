package state;

/**
 * Created by liqianga on 2018/1/31.
 */
public class HasQuarterState implements State {
    private CandyMachine candyMachine;

    public HasQuarterState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    public void insertQuarter() {
        System.out.println("Already has quarter!");
    }

    public void ejectQuarter() {
        this.candyMachine.setCurrentState(this.candyMachine.getNonQuarterState());
    }

    public void turnCrank() {
        this.candyMachine.setCurrentState(this.candyMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("Please turn Crank");
    }
}
