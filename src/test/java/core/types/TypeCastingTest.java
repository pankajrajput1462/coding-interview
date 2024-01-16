package core.types;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeCastingTest {

    private static TypeCasting typeCasting;

    @BeforeAll
    public static void initData() {
        typeCasting = new TypeCasting();
    }

    @Test
    void testShort() {
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MIN_VALUE);
        System.out.println("typeCasting = " + typeCasting.intToShort(55));
        System.out.println("32767 = " + typeCasting.intToShort(32767));
        System.out.println("32768 = " + typeCasting.intToShort(32768));
        System.out.println("32767 = " + Integer.toBinaryString(32767));
        System.out.println("32768 = " + Integer.toBinaryString(32768));
        System.out.println("32771 = " + Integer.toBinaryString(32771));
        System.out.println("32771-> " + Integer.toBinaryString(32771));
        System.out.println("65534-> " + Integer.toBinaryString(65534));
        System.out.println(" 65535-> " + Integer.toBinaryString(65535));
        System.out.println("typeCasting = " + typeCasting.intToShort(65535));
        System.out.println(" 65536-> " + Integer.toBinaryString(65536));
        System.out.println("typeCasting = " + typeCasting.intToShort(65536));
        System.out.println("typeCasting = " + typeCasting.intToShort(65537));
    }

    @Test
    void byteTest() {
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MIN_VALUE);
        System.out.println("typeCasting = " + typeCasting.shortToByte((short) 127));
        System.out.println("typeCasting = " + Integer.toBinaryString(127));
        short value = 128;
        System.out.println(" = " + typeCasting.shortToByte(value));
        System.out.println("Integer.toBinaryString(128) = " + Integer.toBinaryString(128));

        for (short i = 0; i < 90000; i++) {
            System.out.println(i + "->" + Integer.toBinaryString(i) + "->>" + typeCasting.shortToByte(i));
        }
    }

}