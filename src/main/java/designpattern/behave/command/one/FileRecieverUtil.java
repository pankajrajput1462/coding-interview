package designpattern.behave.command.one;

public class FileRecieverUtil {
    public static FileSystemReciever getUnderlyingFileSystem() {
        String property = System.getProperty("os.name");
        if (property.contains("Windows")) {
            return new WindowsFileSystemRecieverImpl();
        } else {
            return new UnixFileSystemRecieverImpl();
        }

    }
}
