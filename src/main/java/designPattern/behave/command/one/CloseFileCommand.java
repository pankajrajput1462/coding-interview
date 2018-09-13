package designPattern.behave.command.one;

public class CloseFileCommand implements Command {
    private FileSystemReciever reciever;

    public CloseFileCommand(FileSystemReciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        this.reciever.closeFile();
    }
}
