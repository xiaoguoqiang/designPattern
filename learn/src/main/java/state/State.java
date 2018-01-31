package state;

/**
 * Created by liqianga on 2018/1/31.
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
