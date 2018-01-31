package state;

/**
 * Created by liqianga on 2018/1/31.
 */
public class NonQuarterState implements State {
    CandyMachine candyMachine;

    public NonQuarterState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    public void insertQuarter() {
        this.candyMachine.setCurrentState(this.candyMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("Don not has quarter!");
    }

    public void turnCrank() {
        System.out.println("Please insert quarter");
    }

    public void dispense() {
        System.out.println("Please insert quarter");
    }
}
