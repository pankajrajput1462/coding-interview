package designPattern.behave.command;

public class FileSystemClient {
    public static void main(String[] args) {
        FileSystemReciever reciever = FileRecieverUtil.getUnderlyingFileSystem();
        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(reciever);

        //Creating invoker and associating with command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        //perform action on file invoker
        fileInvoker.execute();
        /**
         * we can do same for all other events like write and close
         */
    }
}
