package command;

/**
 * Created by liqianga on 2017-12-27.
 */
public class Invoker {
    private Command command;

    public void buttonClick() {
        command.excute();
    }

    public void undoClick(){
        command.undo();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

}
