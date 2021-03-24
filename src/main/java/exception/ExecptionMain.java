package exception;

public class ExecptionMain {
    public static void main(String[] args) {
        try {
            System.out.println("args = " + returnValue());
        } catch (InsideTryException | InsideFinalyException e) {
            System.out.println("e = " + e.getMessage());
        }

    }

    private static boolean returnValue() throws InsideTryException, InsideFinalyException {
        try {
//            return true;
            throw new InsideTryException("Inside the try");
        } finally {
//            return false;
            throw new InsideFinalyException("Inside the finaly");
        }
    }
}
