package observer;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by liqianga on 2017-12-25.
 */
public class CurrentConditionDisplay implements Observer {

    private Observable weatherDate;

    public CurrentConditionDisplay(Observable weatherDate) {
        this.weatherDate = weatherDate;
        this.weatherDate.addObserver(this);
    }

    public void update(Observable o, Object arg) {

    }
}
