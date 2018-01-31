package state;

/**
 * Created by liqianga on 2018/1/31.
 */
public class SoldState implements State {
    private CandyMachine candyMachine;

    public SoldState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    public void insertQuarter() {
        System.out.println("Already has quarter, Please wait");
    }

    public void ejectQuarter() {
        System.out.println("Can not get Quarter After turn Crank");
    }

    public void turnCrank() {
        System.out.println("Please wait!");
    }

    public void dispense() {
        this.candyMachine.realeasBall();
        if(this.candyMachine.getCount() > 0){
            this.candyMachine.setCurrentState(this.candyMachine.getNonQuarterState());
        }else{
            this.candyMachine.setCurrentState(this.candyMachine.getSoldOutState());
        }
    }
}
