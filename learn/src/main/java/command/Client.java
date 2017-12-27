package command;

/**
 * Created by liqianga on 2017-12-27.
 */
public class Client {

    public static void main(String[] args){
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        invoker.buttonClick();

    }

}
