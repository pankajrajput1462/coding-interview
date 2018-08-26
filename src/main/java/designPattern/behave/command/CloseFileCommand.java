package designPattern.behave.command;

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
