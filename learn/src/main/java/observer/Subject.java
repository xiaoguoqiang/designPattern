package observer;

/**
 * Created by liqianga on 2017-12-25.
 */
public interface Subject {
     void registObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserver();
}
