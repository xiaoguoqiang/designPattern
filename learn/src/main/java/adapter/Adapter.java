package adapter;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void quack(){
        adaptee.song();
    }

    public void fly() {
        adaptee.run();
    }
}
