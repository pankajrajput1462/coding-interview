package designPattern.behave.command.one;

public class OpenFileCommand implements Command {
    private FileSystemReciever reciever;

    public OpenFileCommand(FileSystemReciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        this.reciever.openFile();
    }
}
