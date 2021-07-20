package string;

public class PrimitiveLearning {
    //private  int a;
  //  byte aByte=127;
    Integer integer;
    Short  aShort;
    //Byte aByteA= new Byte(aByte);
    Number number;

    private long l;

    private float f;
    private double d;

    private boolean b;

    private void sample()
    {
        byte b=127;

        // System.out.println("a = " + a);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b = " + b);
        System.out.println("aByte = " + b);
    }

    public static void main(String[] args) {
        new PrimitiveLearning().sample();

    }
}
