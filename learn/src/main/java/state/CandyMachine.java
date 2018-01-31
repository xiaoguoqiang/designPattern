package state;

/**
 * Created by liqianga on 2018/1/31.
 */
public class CandyMachine {

    private NonQuarterState nonQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private SoldOutState soldOutState;

    private State currentState = soldOutState;
    private int count;

    public CandyMachine(int count){
        this.nonQuarterState = new NonQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.count = count;
        if(this.count > 0){
            this.currentState = this.nonQuarterState;
        }
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

    public Integer getCount(){
        return this.count;
    }

    public State getNonQuarterState(){
        return this.nonQuarterState;
    }

    public State getHasQuarterState(){
        return this.hasQuarterState;
    }

    public State getSoldState(){
        return this.soldState;
    }

    public State getSoldOutState(){
        return this.soldOutState;
    }

    public void insertQuarter(){
        this.currentState.insertQuarter();
    }

    public void ejectQuarter(){
        this.currentState.ejectQuarter();
    }

    public void turnCrank(){
        this.currentState.turnCrank();
        this.currentState.dispense();
    }

    public void realeasBall(){
        System.out.println("A gumball comes rolling out");
        if(count != 0) {
            count = count - 1;
        }
    }

}
