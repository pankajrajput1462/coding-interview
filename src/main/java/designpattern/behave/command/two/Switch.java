package designpattern.behave.command.two;

/**
 * Invoker
 */
public class Switch {
    public void storeAndExecuteCommand(Command command) {
        command.execute();
    }
}
