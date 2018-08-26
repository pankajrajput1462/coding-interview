package designPattern.behave.command;

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
