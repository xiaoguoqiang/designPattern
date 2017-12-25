package observer;

import java.util.Observable;

/**
 * Created by liqianga on 2017-12-25.
 */
public class WeatherData extends Observable {

    public void modelChanged(){
        setChanged();
        notifyObservers();
    }
}
