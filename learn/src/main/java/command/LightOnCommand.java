package command;

/**
 * Created by liqianga on 2017-12-27.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void excute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
