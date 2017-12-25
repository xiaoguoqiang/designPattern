package observer;

/**
 * Created by liqianga on 2017-12-25.
 */
public interface Subject {
    public void registObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
