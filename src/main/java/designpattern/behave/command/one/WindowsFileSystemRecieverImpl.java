package designpattern.behave.command.one;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WindowsFileSystemRecieverImpl implements FileSystemReciever {

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows");
    }
}
