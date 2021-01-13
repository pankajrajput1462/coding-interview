package designpattern.behave.command.one;

public class WriteFileCommand implements Command {
    private FileSystemReciever reciever;

    public WriteFileCommand(FileSystemReciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        this.reciever.writeFile();
    }
}
