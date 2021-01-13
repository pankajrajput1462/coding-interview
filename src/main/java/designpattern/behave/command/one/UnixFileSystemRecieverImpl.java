package designpattern.behave.command.one;

public class UnixFileSystemRecieverImpl implements FileSystemReciever {
    @Override
    public void openFile() {
        System.out.println("Opening file in Unix");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Unix");
    }

    @Override
    public void closeFile() {
        System.out.println("Close file in Unix");
    }
}
