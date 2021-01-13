package exception;

public class ExecptionMain {
    public static void main(String[] args) {
        try {
            System.out.println("args = " + args);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
